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
  if(val.name=="Parle Biscuit"){//Setting default value
    price.value = val.price;
  }
}

//showing unit price for particular product
document.querySelector('#product').addEventListener('click', function () {
  price.value = this.value;
});

const bill = document.querySelector('table');//table area
const buy = document.querySelector('#buy');//add to cart button

let i = 1;
var finalcart = [];

buy.addEventListener("click", function () {//on click of add cart button

  let select = document.getElementById('product');//selected product
  let price = select.options[select.selectedIndex].value;//its price
  let productName = select.options[select.selectedIndex].text;//its name

  let selectQuantity = document.getElementById('qty');
  let qty = selectQuantity.options[selectQuantity.selectedIndex].value;//its quantity

  let present = false;

  let allProductName = document.querySelectorAll(".productName")
  console.log(productName);//printing selected product name

  // for (var i = 0; i < allProductName.length; i++) {

  //     if (productName == allProductName[i].childNodes[0].nodeValue.trim()) {

  //         let quantity = allProductName[i].parentElement.children[1];
  //         let unitPrice = allProductName[i].parentElement.children[2];
  //         let toatlPrice = allProductName[i].parentElement.children[3];

  //         quantity.innerHTML = Number(quantity.innerHTML) + Number(qty);
  //         toatlPrice.innerHTML = Number(toatlPrice.innerHTML) + (price * qty)

  //         let total = document.getElementById('total');
  //         total.textContent = Number(total.textContent) + (price * qty);
  //         present = true;
  //     }
  // }

  // var contains = JSON.stringify(finalcart);
  // console.log(finalcart);
  if (finalcart.includes(productName)) {
    present = true;
    alert("Item already exist in Cart")
  }

  // if (present) {
  //     //update qty
  //     //update total
  //     //update bill
  //     alert("Item already exist in Cart")
  // }

  if (!present) {//if not present in table
    //adding into table
    bill.innerHTML += `<tr>
        <td class="productName"> ${productName}</td>
        <td class="quantity"> 
            <div class="wrapper">
            <div id="minus" class="minus" onclick="decrement(this,${price})">-</div>
            <div id="num" class="num">${qty}</div>
            <div id="plus" class="plus" value="click" onclick="increment(this,${price})">+</div>
            </div>
        </td>

        <!-- <td> ${qty} </td> -->     
        <td >  ${price}</td>
        <td id="utotal" >  ${price * qty}</td>
        <td > <i class="fa fa-trash-o delete"></i></td>
        </tr> `;

    total = (price,qty) => {
      let total = document.getElementById('total');//displaying total cart value
      total.textContent = Number(total.textContent) + (price * qty);
      return Number(total.textContent) + (price * qty);
    }

    totalMinus = (currentItemtotalPrice) => {
      let total = document.getElementById('total');
      total.textContent = Number(total.textContent) - currentItemtotalPrice;//after total price
      return Number(total.textContent) - currentItemtotalPrice;
    }
    total(price,qty);
    // console.log(productName);
    finalcart.push(productName)

  }
});

bill.addEventListener('click', e => {//on click of delete button
  if (e.target.classList.contains('delete')) {//checking weather that btn class contains delete class
    e.target.parentElement.parentElement.remove();//if yes the remove element

    // console.log(e.target);
    const a = e.target.parentElement.parentElement;
    const currentItemtotalPrice = a.querySelector("#utotal").textContent//before total price
    // console.log(currentItemtotalPrice);
    total.textContent = totalMinus(currentItemtotalPrice);//after total price
    const allProductName = a.querySelector(".productName").textContent
    //console.log(allProductName);
    finalcart.pop(allProductName)
  }
})

function increment(plusbtn, price) {

  var parent = plusbtn.parentNode;
  var child = parent.childNodes
  var quantity
  var subTotal;
  var i;
  var j;
  // console.log(child);
  for (i = 0; i < child.length; i++) {
    if (i == 3) {
      quantity = parseInt(child[i].innerText)
      quantity = quantity + 1;
      child[i].innerText = quantity
    }
  }
  var tr = parent.parentNode.parentNode;
  // console.log(tr);
  for (let j = 0; j < tr.childNodes.length; j++) {
    if (j == 9) {
      // console.log(tr.childNodes[j]);

      // subTotal = price * quantity;
      // console.log(subTotal);
      // console.log(tr.childNodes[j]);
      tr.childNodes[j].innerText = price * quantity
    }
    if (j == 7) {
      const unitPrice = tr.childNodes[j].textContent//unit price
      total.textContent = total(unitPrice,1);//after total price
    }
  }
  // console.log(price);
  // console.log(quantity);
  // total(price,quantity-1);
  // console.log(finalcart);
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
            total.textContent = totalMinus(unitPrice);//after total price
          }
        }
      } else {
        alert("Item can't be zero")
      }
      child[i].innerText = quantity
    }
  }
}

