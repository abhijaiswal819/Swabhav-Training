const getTodos = function (callback, url) {
    const request = new XMLHttpRequest();

    request.addEventListener("readystatechange", () => {
        if (request.readyState == 4 && request.status == 200) {
            //console.log(request.responseText);
            callback(undefined, JSON.parse(request.responseText));
        }
        else if (request.readyState == 4) {
            //console.log("Could not fetch data");
            callback("Could not fetch data", undefined);
        }
    });

    request.open("GET", url);
    request.send();
};

//const url = "https://jsonplaceholder.typicode.com/todos";
const url = "abhi.json"
getTodos((err, data) => {
    if (err) {
        console.log("Error!! :" + err);
    }
    else {
        console.log(data);
    }
}, url);
