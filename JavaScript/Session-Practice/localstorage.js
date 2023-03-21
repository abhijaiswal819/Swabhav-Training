// localStorage.setItem("1","Jitin");
// localStorage.setItem("2","Amar");
// localStorage.setItem("3","Nayan");

// console.log(localStorage.getItem("1"))
// console.log(localStorage.length);
// localStorage.clear();

// console.log(localStorage.getItem("1"))

//adding array to localstorage
const names = ["ABC", "XYZ", "PQR", "LMO"];
localStorage.setItem("names", JSON.stringify(names));

const studentNames = JSON.parse(localStorage.getItem("names"));
console.log(studentNames);

// let i=1;
// arr.forEach((n)=>{
//     localStorage.setItem(i, n);
//     i++;
// })

//adding array of objects in localStorage
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
        name: "Surya",
        score: 123
    },
    {
        name: "Rohit",
        score: 23
    },
    {
        name: "Dhoni",
        score: 223
    }
];

localStorage.setItem("players", JSON.stringify(players));
const playerNames = JSON.parse(localStorage.getItem("players"));
console.log(playerNames);