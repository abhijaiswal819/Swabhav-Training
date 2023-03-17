//Funtion to add new list to the UL on click of button

//Method-1
// Get the button and list container elements
const addBtn = document.querySelector("button");
const listContainer = document.querySelector("ul");

// Add a click event listener to the button
addBtn.addEventListener("click", () => {

    var name = document.querySelector("#i1").value;
    // var Tname = document.querySelector("#i2").value;
    // const body = document.querySelector("body");

    if (name != ""){//} && Tname != "") {
        // Create a new list item element
        const newList = document.createElement("li");
        newList.textContent += name+" - Normal";

        // Append the new list item to the list container
        listContainer.appendChild(newList);

        // const newPara = document.createElement("p");
        // newPara.textContent = Tname+" - Normal";
        // body.appendChild(newPara);
        // newPara.textContent="";
    }
    else{
        alert("Please enter name.");
    }  
});

//Method-2
html=``;
addBtn.addEventListener("click", () => {
    var name = document.querySelector("#i1").value;
    // var Tname = document.querySelector("#i2").value;

    if (name != ""){//} && Tname != "") {
        html+=`<li>${name} - Template String</li>`;
        listContainer.innerHTML+=html;
        html=``;
    }
    else{
        alert("Please enter name.");
    }
});

// Function to delete list on click of that list 
const list = document.querySelectorAll("li");
//console.log(list);
list.forEach(l=>{
    l.addEventListener('click', e=>{
        console.log(l.innerText+" (Deleted)");
        listContainer.removeChild(l);
    })
})

// Function to delete list on click of that list and also can delete added list
listContainer.addEventListener('click',e=>{
    if(e.target.localName=='li'){
        console.log(e.target.innerText+" (Deleted)");
        e.target.remove();
    }
})