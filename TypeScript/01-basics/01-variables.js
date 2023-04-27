var found = false;
var first_name = "Ajay";
var scores = [10, 20, 30, 40, 50, 60];
console.log(found);
console.log(first_name);
scores.forEach(function (score) {
    console.log(score);
});
var sum = scores.reduce(function (acc, currentValue) {
    return acc + currentValue;
}, 0);
console.log(sum);
var names = ["Abhi", "Akshay", "Tejas"];
names.forEach(function (name) {
    console.log(name);
});
