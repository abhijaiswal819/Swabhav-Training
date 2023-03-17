const addBtn = document.querySelector("button");

addBtn.addEventListener("click", () => {
    var iname = document.querySelector("#i1").value;
    if (iname != "" ) {

        // Set the value of the second input box to the value of the first input box
        document.querySelector("#i2").value = iname;
    }
    else{
        alert("Please enter something.");
    }  
});