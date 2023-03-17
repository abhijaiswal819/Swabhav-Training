//Array methods

//create new array that holds score greater than 30
const score = [10, 20, 30, 40, 50, 60];
//method 1
let nscore = [];
for (let i = 0; i < score.length; i++) {
    if (score[i] > 30) {
        nscore.push(score[i]);
    }
}
console.log(nscore);
//method 2
const filteredscore = score.filter((score) => {
    return score > 30;
});
console.log(filteredscore);

//create new array that holds even and odd number
const numlist = [76, 71, 30, 90, 59, 31];
//even
let evenlist = [];
for (let i = 0; i < numlist.length; i++) {
    if (numlist[i] % 2 == 0) {
        evenlist.push(numlist[i]);
    }
}
console.log(evenlist);
//odd
const oddlist = numlist.filter((numlist) => {
    return numlist % 2 == 1;
});
console.log(oddlist);

//displaying premium users using filter method
const users = [
    {
        name: "Abhishek",
        premium: true
    },
    {
        name: "Amogh",
        premium: false
    },
    {
        name: "Rasika",
        premium: true
    },
    {
        name: "Krutika",
        premium: false
    }
];
const premiumUsers = users.filter((user) => {
    return user.premium;
});
console.log(premiumUsers);

//displaying price greater than 300 using filter method
const products = [
    {
        name: "Parle-g",
        price: 300
    },
    {
        name: "Sunfeast",
        price: 200
    },
    {
        name: "Marie",
        price: 400
    },
    {
        name: "Jimjam",
        price: 500
    }
];
const highCostProducts = products.filter((product) => {
    return product.price > 300;
});
console.log(highCostProducts)

//map function
//taking square of numlist
const sqrlist = numlist.map((n) => {
    return n * n;
})
console.log(sqrlist);

//taking 10% price increase of product
const updatedprice = products.map((product) => {
    return { name: product.name, price: product.price * 1.10 };
});
console.log(updatedprice);

//reduce function
//calculating sum
const values=[12,23,43,45,55,67,78];
const sum = values.reduce((acc,val)=>{
    return acc+val;
},0);
//0 means to initialize acc with default value
console.log(sum);

//calculating sum of scores
const players=[
    {
        name: "Sachin",
        score: 23
    },
    {
        name: "Virat",
        score: 23
    },
    {
        name: "Sachin",
        score: 123
    },
    {
        name: "Rohit",
        score: 23
    },
    {
        name: "Sachin",
        score: 223
    }
];
//using reduce
const sumscore = players.reduce((acc,player)=>{
    if(player.name=="Sachin"){
        return acc+player.score;
    }
    return acc;
},0);
console.log(sumscore);

//using filter
const scoreTotal = players.filter((player)=>{
    return player.name=="Sachin"
}).reduce((acc,player)=>{
    return acc+player.score;
},0);
console.log(scoreTotal);

//find method
const marks = [21,23,34,45,47,12,34,33];
const testMark = marks.find((mark)=>{
    return mark>40;
});
//returns first value which satisfies the condition
console.log(testMark);

//sort
//it checks only 1st digit not whole number
const sortedMarks = marks.sort();
console.log(sortedMarks);

//it sorts based on whole number
const sortedMarks1 = marks.sort((m1,m2)=>{
    return m1-m2;
});
console.log(sortedMarks1);

//sorting price of product
const sortedProduct = products.sort((p1,p2)=>{
    return p1.price-p2.price;
});
console.log(sortedProduct);

//sorting price of product
const discountedProduct = products.filter((product)=>{
    return product.price>200;
}).map((product)=>{
    return { name: product.name, price: product.price * 0.60 };
}).sort((p1,p2)=>{
    return p1.price-p2.price;
});
console.log(discountedProduct);