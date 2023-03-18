console.log(1);
console.log(2);
console.log(3);

//Asynchronous method 
//code that can start now and finish later
setTimeout(() => {
    console.log("Callback funtion called..");
}, 2000);

console.log(4);
console.log(5);
console.log(6);

//XHR stands for XML Http Request
//makes request to get data from API endpoints
const getTodos = function (url) {
    const request = new XMLHttpRequest();
    //request.open("GET", "https://jsonplaceholder.typicode.com/todos");
    //Inspect>Network>Scroll down>Names>todos>click>Headers&Response
    //Status Code-200 means data received from that API
    //Status Code-404 means File/Page page not found from that API
    request.addEventListener("readystatechange", () => {
        if (request.readyState == 4 && request.status == 200) {
            console.log(request.responseText);
        }
        else if (request.readyState == 4) {
            console.log("Could not fetch data");
        }
    })
    /*readyState
    0: Unsent
    1: Open
    2: Received Headers
    3: Loading
    4: Complete
    */
   request.open("GET", url);
    request.send();
};
//getTodos

getTodos("https://jsonplaceholder.typicode.com/comments");

