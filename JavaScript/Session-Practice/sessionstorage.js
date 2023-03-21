
//adding array to localstorage
// const names = ["ABC", "XYZ", "PQR", "LMO"];
// sessionStorage.setItem("names", JSON.stringify(names));

// const studentNames = JSON.parse(sessionStorage.getItem("names"));
// console.log(studentNames);

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

sessionStorage.setItem("players", JSON.stringify(players));
const playerNames = JSON.parse(sessionStorage.getItem("players"));
console.log(playerNames);