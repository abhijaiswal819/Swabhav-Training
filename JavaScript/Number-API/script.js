const startF = async (input1) => {
    // console.log(input1);
    const response = await fetch("http://numbersapi.com/" + input1);
    if (response.status != 200) {
        throw new Error("Invalid url");
    }
    const data = await response.text();
    return data;
};

const addBtn = document.querySelector("button");
const input1 = document.querySelector("#one").value;

addBtn.addEventListener("click", () => {
    const input1 = document.querySelector("#one").value;
    if (input1 != "") {
        // console.log(input1);
        startF(input1).then((data) => {
            console.log(data);
            funcToAdd(data);
        })
        .catch(err => {
            console.log("Could not fetch data " + err);
        })
    }
    else {
        alert("Please enter something.");
    }
});

function funcToAdd(data) {
    const input2 = document.querySelector("#two");
    document.querySelector("#two").value = data;

    const date = new Date();
    var current_date = date.getFullYear() + "-" + (date.getMonth() + 1) + "-" + date.getDate();
    var current_time = date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
    var date_time = current_date + " " + current_time;

    localStorageAdd(data, date_time);
}

function localStorageAdd(data, date) {
    if (localStorage.getItem(input1) != null) {
        const valData = JSON.parse(localStorage.getItem(input1));
        document.querySelector("#three").value = valData[0].date;
        document.querySelector("#four").value = valData[0].msg;
    }
    else {
        document.querySelector("#three").value = "None";
        document.querySelector("#four").value = "None";
    }

    // const valData = JSON.parse(localStorage.getItem(input1));
    // console.log(valData);
    // document.querySelector("#three").value = valData[0].date;
    // document.querySelector("#four").value = valData[0].msg;

    const val = [
        {
            date: date,
            msg: data
        }
    ];
    localStorage.setItem(input1, JSON.stringify(val));
}