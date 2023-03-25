const sumButton = document.querySelector("#sum");
const colorButton = document.querySelector("#color");
const worker = new Worker("webworker.js");

sumButton.addEventListener('click',(e)=>{
    worker.postMessage("test");
})

worker.onmessage=(res)=>{
    alert("Sum is : "+res.data);
}

colorButton.addEventListener('click',(e)=>{
    if(document.body.style.backgroundColor!="green"){
        document.body.style.backgroundColor="green";
    }
    else{
        document.body.style.backgroundColor="cyan";
    }
})