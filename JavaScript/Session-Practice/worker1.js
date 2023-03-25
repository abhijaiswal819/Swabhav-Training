const sumButton = document.querySelector("#sum");
const colorButton = document.querySelector("#color");

sumButton.addEventListener('click',(e)=>{
    let sum = 0;
    for(let i=1;i<=1000000000;i++){
        sum+=i;
    }
    alert("Sum = "+sum);
})

colorButton.addEventListener('click',(e)=>{
    if(document.body.style.backgroundColor!="green"){
        document.body.style.backgroundColor="green";
    }
    else{
        document.body.style.backgroundColor="cyan";
    }
})