let found:boolean=false;

let first_name:string="Ajay";

let scores:number[]=[10,20,30,40,50,60];

console.log(found);
console.log(first_name);

scores.forEach(score=>{
    console.log(score);
    
})

var sum = scores.reduce((acc,currentValue)=>{
    return acc+currentValue
},0);

console.log(sum);

let names:String[]=["Abhi","Akshay","Tejas"];
names.forEach(name=>{
    console.log(name);
})