// console.log("hello");

//to find div
// const div=document.querySelector("div");
// console.log(div);

//to find h1
/*
const h1=document.querySelector("h1");
console.log(h1);

const h2=document.querySelector("h2");
console.log(h2);

//to find p
const p=document.querySelector("p");
console.log(p);

//to find p with id #Para2
const p2=document.querySelector("#Para2");
console.log(p2);
p2.innerText ="New Para2"
p2.innerHTML ="New Para2"

//to add array in div
const div=document.querySelector("div");
let players=["Sachin","Rohit","Virat","Dhoni"];
html=``;
players.forEach(players=>{
    html+=`<p>${players}</p>`
})
div.innerHTML+=html;

//to find all p
const paras=document.querySelectorAll("p");
paras.forEach(paras => {
    console.log(paras.innerText)
});

//to find all tag referenec with class="test"
const tags=document.querySelectorAll(".test");
console.log(tags);

tags.forEach((tag)=>{
    console.log(tag.innerText);
})

//to find reference of div with class error
const div2=document.querySelector("div.error");
console.log(div2);

//accessing para by ID
const para2=document.getElementById("Para2");
console.log(para2);

//accessing class by class name
const testTags=document.getElementsByClassName("test");
console.log(testTags);
// testTags.array.forEach((tag)=>{
//     console.log(tag);
// })

//accessing elements of HTMLCollection
Array.from(testTags).forEach(tag=>{
    console.log(tag.innerText);
})

//adding demo to class by class name
Array.from(testTags).forEach(tag=>{
    tag.innerText+="demo";
})
console.log(testTags);

//accessing tag by TagName
const tagN=document.getElementsByTagName("p");
console.log(tagN);

//accessing anchor tag
const link=document.querySelector("a");
console.log(link);
//by href output
console.log(link.getAttribute("href"));
//changing href
link.setAttribute("href","https:facebook.com");
//showing Facebook instead of Search Here
link.innerText="Facebook";

//adding class success to para2 by setAttribute
const par=document.getElementById("Para2");
par.setAttribute("class","success");
console.log(par);
par.removeAttribute("class","success")

//chaning ID para2 by setAttribute
const parC=document.querySelector("#Para2");
parC.setAttribute("id","para2");
console.log(parC);
parC.setAttribute("id","Para2");
console.log(parC);

//getting reference of tag by copying tag selector Elements(tab): tag(right click)->copy selector
//also not recommended for big project as sequence may change when we add new para into it
const paraS=document.querySelector("body > div:nth-child(1) > p:nth-child(6)");
console.log(paraS);

//adding multiple class name to a class
const h1Ref=document.querySelector("h1");
// h1Ref.setAttribute("class","test1");
// console.log(h1Ref);
// h1Ref.setAttribute("class","test");
// console.log(h1Ref);
h1Ref.classList.add("test1");
console.log(h1Ref);
h1Ref.classList.remove("test1");
*/

//adding class success if p tag contains success word
//adding class error if p tag contains error word
const pAdd = document.querySelectorAll("p");
pAdd.forEach(tag=>{
    //instead of match we can use .includes
    if (tag.innerText.match("success")){
        tag.classList.add("success");
    }
    if (tag.innerText.match("error")){
        tag.classList.add("error");
    }
})

//if div contains error class the remove it or vice-versa to add
const div=document.querySelector("div.error");
div.classList.toggle("error");
div.classList.toggle("error");
div.classList.toggle("error");

//accessing child p tags from parent div
const intiDiv = document.querySelector("div");
//Method-1
Array.from(intiDiv.children).forEach(tag=>{
    // if(tag==document.querySelector("p")){
    //     tag.innerText+="para";
    // }

    // console.log(tag.tagName);

    //Best method
    if(tag.tagName=="P"){
        tag.innerText+=" para"
    }
})
// console.log(intiDiv.children);
//Method-2
intiDiv.childNodes.forEach(child=>{
    if(child.nodeName=='P'){
        child.innerText+=" hello";
    }
})

//accessing parent div from child h2
const h2E = document.querySelector("h2");
console.log(h2E.parentElement);
console.log(h2E.parentNode);

//accessing sibling p, h1 from sibling h2
const h2El = document.querySelector("h2");
console.log(h2El.previousElementSibling);
console.log(h2El.nextElementSibling);
console.log(h2El.nextElementSibling.nextElementSibling);
