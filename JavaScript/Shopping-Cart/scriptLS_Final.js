const products = [
    {
        name: "Parle Biscuit",
        price: 40
    },
    {
        name: "Burbon Biscuit",
        price: 100
    },
    {
        name: "Maggie",
        price: 50
    },
    {
        name: "Lays",
        price: 30
    },
    {
        name: "Kit-Kat",
        price: 50
    },
    {
        name: "Silk",
        price: 160
    }
]

const dropdown = document.querySelector("#product");//select tag
const price = document.querySelector("#price");//unit price

for (let val of products) { //adding product options in drop down
    var option = document.createElement("option");
    option.value = val.price;
    option.text = val.name;
    dropdown.appendChild(option);
    if (val.name == "Parle Biscuit") {//Setting default value
        price.value = val.price;
    }
}

//showing unit price for particular product
document.querySelector('#product').addEventListener('click', function () {
    price.value = this.value;
});

const bill = document.querySelector("table");//table area
const buy = document.querySelector('#buy');//add to cart button

let i = 1;
var finalcart = [];
let pushArr = [];

function loadtable() {
    let html = ``;
    bill.innerHTML = html;
    html = `
    <tr>
        <th scope="col">Product Name</th>
        <th scope="col">Quantity</th>
        <th scope="col">Unit Price</th>
        <th scope="col">Total </th>
        <th scope="col">Remove</th>
    </tr>`
    bill.innerHTML += html;

    pushArr = JSON.parse(localStorage.getItem("DATA"));

    if (pushArr != null) {
        finalcart = []
        for (var i = 0; i < pushArr.length; i++) {
            const valData = pushArr[i];

            finalcart.push(valData.productName);

            html = `<tr>
              <td class="productName"> ${valData.productName}</td>
              <td class="quantity"> 
                  <div class="wrapper">
                  <div id="minus" class="minus" onclick="decrement(this,${valData.price})">-</div>
                  <div id="num" class="num">${valData.qty}</div>
                  <div id="plus" class="plus" value="click" onclick="increment(this,${valData.price})">+</div>
                  </div>
              </td>
      
              <!-- <td> ${qty} </td> -->     
              <td >  ${valData.price}</td>
              <td id="utotal" >  ${valData.utotal}</td>
              <td > <i class="fa fa-trash-o delete"></i></td>
              </tr> `;

            bill.innerHTML += html;
            total();
        }
    }
    // console.log(pushArr);
    // console.log(finalcart);
}
loadtable();

buy.addEventListener("click", function () {//on click of add cart button

    let select = document.getElementById('product');//selected product
    let price = select.options[select.selectedIndex].value;//its price
    let productName = select.options[select.selectedIndex].text;//its name

    let selectQuantity = document.getElementById('qty');
    let qty = selectQuantity.options[selectQuantity.selectedIndex].value;//its quantity

    let present = false;

    let allProductName = document.querySelectorAll(".productName")
    console.log("Item selected to add in cart: " + productName);//printing selected product name

    // console.log(finalcart);
    if (finalcart.includes(productName) == true) {
        present = true;
        alert("Item already exist in Cart")
    }

    if (!present) {//if not present in table
        let val = {
            productName: productName,
            qty: qty,
            price: price,
            utotal: price * qty
        };

        // console.log(val);

        pushArr = pushArr || [];
        // pushArr.push({"1": val.productName, "2": val.qty, "3": val.price, "4": val.utotal});
        pushArr.push(val)
        // console.log(pushArr);
        localStorage.setItem("DATA", JSON.stringify(pushArr));

        finalcart.push(productName);
        // console.log(finalcart);
        loadtable();
        total();
    }
});

function total() {
    let total = document.getElementById('total');//displaying total cart value
    let sum = 0;
    // console.log(finalcart);
    for (var i = 0; i < pushArr.length; i++) {
        const valData = pushArr[i];
        sum = sum + valData.utotal;
    }
    total.textContent = sum
    return sum;
}

bill.addEventListener('click', e => {//on click of delete button
    if (e.target.classList.contains('delete')) {//checking weather that btn class contains delete class
        // e.target.parentElement.parentElement.remove();//if yes the remove element

        const a = e.target.parentElement.parentElement;
        const allProductName = a.querySelector(".productName").innerText
        console.log("Item selected to delete: " + allProductName);

        // for (var i = pushArr.length - 1; i >= 0; --i) {
        //     if (pushArr[i].productName == allProductName) {
        //         // push.splice(i,1);
        //         console.log(i);
        //     }
        //     else{
        //         console.log(i);
        //     }
        // }
        let ind = pushArr.findIndex(x => x.productName === allProductName)
        // console.log(ind);
        // console.log(pushArr);
        // console.log(finalcart);

        pushArr.splice(ind, 1)
        let indF = finalcart.indexOf(allProductName)
        finalcart.splice(indF, 1)
        // console.log(finalcart);
        // console.log(pushArr);
        // console.log(finalcart);
        e.target.parentElement.parentElement.remove();//if yes the remove element

        localStorage.setItem("DATA", JSON.stringify(pushArr));

        // finalcart.pop(finalcart.find(allProductName))

        // console.log(localStorage.getItem(allProductName));
        // console.log(typeof allProductName);
        // console.log(localStorage.key(localStorage.getItem(allProductName)));
        // console.log(localStorage.key(allProductName));
        // localStorage.removeItem(localStorage.key(localStorage.getItem(allProductName)))
        // localStorage.removeItem(localStorage.key(allProductName))
        // localStorage.removeItem(allProductName)
        // if (localStorage.length == 1) {
        //     localStorage.removeItem(localStorage.key(allProductName), 0)
        // }
        // else {
        //     localStorage.removeItem(localStorage.key(allProductName))
        // }
        total();
    }
})

function increment(plusbtn, price) {

    var parent = plusbtn.parentNode;
    var child = parent.childNodes
    var quantity
    var subTotal;
    var i;
    var j;

    for (i = 0; i < child.length; i++) {
        if (i == 3) {
            quantity = parseInt(child[i].innerText)
            quantity = quantity + 1;
            child[i].innerText = quantity
        }
    }
    var tr = parent.parentNode.parentNode;
    for (let j = 0; j < tr.childNodes.length; j++) {
        if (j == 9) {
            tr.childNodes[j].innerText = price * quantity
        }
        if (j == 7) {
            const unitPrice = tr.childNodes[j].textContent//unit price
            // total.textContent = total(unitPrice, 1);//after total price
            total();
        }
        if (j == 1) {
            // console.log(localStorage.getItem(localStorage.key(tr.childNodes[j].textContent)));
            // console.log(tr.childNodes[j].textContent);
            let ind = pushArr.findIndex(x => x.productName === tr.childNodes[j].innerText)
            // console.log(pushArr);
            // console.log(ind);
            pushArr[ind].qty = quantity
            pushArr[ind].utotal = pushArr[ind].price * quantity
            // console.log(pushArr[ind].qty);
            // console.log(pushArr[ind].utotal);

            localStorage.setItem("DATA", JSON.stringify(pushArr));

            // const valData = JSON.parse(localStorage.getItem(localStorage.key(tr.childNodes[j].textContent)))
            // valData.qty = valData.qty
            // const val = {
            //     productName: valData.productName,
            //     qty: quantity,
            //     price: valData.price,
            //     utotal: valData.price * quantity
            // };
            // localStorage.setItem(localStorage.key(tr.childNodes[j].textContent), JSON.stringify(val))
            // const valData1 = JSON.parse(localStorage.getItem(localStorage.key(tr.childNodes[j].textContent)))
            // console.log(quantity);
            // console.log(valData1);
        }
    }
}

function decrement(minusBtn, price) {
    var parent = minusBtn.parentNode;
    var child = parent.childNodes
    var quantity
    var i;
    for (i = 0; i < child.length; i++) {
        if (i == 3) {
            quantity = parseInt(child[i].innerText)
            if (quantity > 1) {
                quantity = quantity - 1;

                var tr = parent.parentNode.parentNode;
                for (let j = 0; j < tr.childNodes.length; j++) {
                    if (j == 9) {
                        // console.log(price * quantity);
                        // console.log(tr.childNodes[j].innerText);
                        tr.childNodes[j].innerText = price * quantity
                    }
                    if (j == 7) {
                        const unitPrice = tr.childNodes[j].textContent//unit price
                        // total.textContent = totalMinus(unitPrice);//after total price
                        total();
                    }
                    if (j == 1) {
                        // console.log(tr.childNodes[j].textContent);
                        let ind = pushArr.findIndex(x => x.productName === tr.childNodes[j].innerText)
                        pushArr[ind].qty = quantity
                        pushArr[ind].utotal = pushArr[ind].price * quantity
                        localStorage.setItem("DATA", JSON.stringify(pushArr));
                    }
                }
            } else {
                alert("Item can't be zero")
            }
            child[i].innerText = quantity
        }
    }
}

