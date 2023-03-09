// alert("Hello");
//console.log("HI");

let value=20.5;
console.log(typeof value);

value="ABHI";
console.log(typeof value);

//variables in js
//js is an interpreted language not a compiled language
//js is loosely typed language

const age=30;
console.log(age);

//datatype in js
//1. number
//2. string
//3. boolean
//4. null
//5. undefined
//6. object

//String

let fname="ABHI";
let lname="JAISWAL";

let fullname=fname+" "+lname;
console.log(fullname);
console.log(fullname.length+100);
console.log(fname[1]);
console.log(fname.toLowerCase());
console.log(fname.toUpperCase());

let email="abhi.jaiswal@gmail.com";
//task
//to get the domain name from the email id

console.log(email.substring(email.indexOf("@")+1));
console.log(email.substring(3,5));
console.log(email.slice(3,5));
console.log(email.slice(-8));

result=email.replace("abhi","abhishek");
console.log(email);
console.log(result);

//template string
const title="Progamming basics";
const author="Abhi Jaiswal";
const likes=3000;

const strResult=title+" by "+author+" has "+likes+" likes.";
console.log(strResult);

//by using template string
const authorstr=`${title} by ${author} has ${likes} likes.`;
console.log(authorstr);

//template string to create HTML content
let html=`
        <h1>Title page<h1>
        <h2>${title}<h2>
        <p>${author}<p>
        <p>${likes}<p>
        `;
console.log(html);

//undefined and null
let highscore;

console.log(highscore);
//output- undefined

console.log(highscore+100);
//output- NaN means- not a number

let val=null;
console.log(val+100);
//output- 100 null means 0 here

//Arrays
let players=["Abhi", "Shivam", "Rahul", "Sarvesh"];
console.log(players.length);
console.log(players.indexOf("Rahul"));

players.push("Anisha");
console.log(players);

players.pop();
console.log(players);

console.log(players.includes("Abhi"));

//loose vs strict comparison
let age1=30;
let score="30";

console.log(typeof age1);
console.log(typeof score);

console.log(age1==30);
console.log(age1=='30');

console.log(age1==score); //loose comparision in which type is ignored
console.log(age1===score);

//type conversion
let score1='100';
let test=Number(score1);
console.log(test);

let result1=String(50);
let result2=Boolean(100);
let result3=Boolean(0);
let result4=Boolean("asd");
console.log(result4);


////////////////////////////////////////////////
//funtions
function greet(user){
    console.log("Hello from "+user);
}
greet("Abhi");

function addNumbers(a,b){
    console.log("Addition is "+(a+b));
}
addNumbers(10,20);

function addNumbers1(a,b){
    return(a+b);
}
console.log("Addition is "+addNumbers1(15,20)); 

//funtion expression
const greetings=function(){
    console.log("Good Morning all..");
};
greetings();

//funtion hoisting
// funtions are hoisted at the top of the files where as the function expression are not
// hence functions can be called before they are declared

//default parametres

const speak=function(name="Abhi",time="morning"){
    console.log(name +" says good "+time);
}
speak();

//area of circle
const circleArea=function(radius){
    return 3.14*radius*radius;
}
console.log(circleArea(10));

//using arrow functions
const circleArea1=radius=>3.14*radius*radius;

console.log(circleArea1(20));

const bill=(product,tax)=>{    let total=0;
    for(let i=0;i<product.length;i++){
        total+=product[i]*product[i]*tax;
    }
    return total;
};
console.log(bill([10,20,30,40],0.1));

//callback method
const myFunction=(callBackFunc)=>{
    callBackFunc(50);
};

myFunction(function(value){
    console.log("Calling callBackFunc");//passing a method as argument  
    console.log(value);
});

//for Each Method
let playerss=["Sachin","Rohit","Virat","Dhoni"];
playerss.forEach((p,i)=>{
    console.log(p+" "+i );
});

//ul tag
const ul=document.querySelector("ul");
html2=``;
playerss.forEach(playerss=>{
    html2+=`<li>${playerss}</li>`
})
ul.innerHTML=html2;

//object literals
let user={
    name : "RAM",
    age : 39,
    email : "ram@gmail.com",
    blogs : ['JS in 2 hours','Java in 30 minutes','HTML in 15 minutes']
};

// .notation to access object members
console.log(user.blogs[1]);

// square bracket noatation to access object members
console.log(user['blogs'][1]);

//Adding methods objects
let user1={
    name : "SAM",
    age : 29,
    email : "sam@gmail.com",
    blogs : ['JS in 7 days','HTML basics for beginners'],

    login : function(){
        console.log(this.name+" logged in.");
    },

    logout : function(){
        console.log(this.name+" logged out.");
    },

        logBlogs : function(){
            this.blogs.forEach(blogs=>console.log(blogs));
        }
    };
    user1.login();
    user1.logout();
    user1.name="JAM";
    console.log(user1.name);
    user1.logBlogs();

    //Array of objects
    let blogs=[
        {
            title : "Java in 2 hours",
            likes : 2000
        },
        {
            title : "Cook better with abhi",
            likes : 20000
        },
        {
            title : "Learn to earn",
            likes : 200
        },
        {
            title : "Investing in stocks",
            likes : 20
        },
    ]
    console.log(blogs);

    let user2={
        name : "SAM",
        age : 29,
        email : "sam@gmail.com",
        blogs : [
            {
                title : "Java in 2 hours",
                likes : 2000
            },
            {
                title : "Cook better with abhi",
                likes : 20000
            },
            {
                title : "Learn to earn",
                likes : 200
            },
            {
                title : "Investing in stocks",
                likes : 20
            },
        ],
    
        login : function(){
            console.log(this.name+" logged in.");
        },
    
        logout : function(){
            console.log(this.name+" logged out.");
        },
    
            logBlogs : function(){
                this.blogs.forEach(blogs=>console.log(blogs.title+" "+blogs.likes));
            }
        };
        user2.login();
        user2.logout();
        user2.name="JAM";
        console.log(user1.name);
        user2.logBlogs();