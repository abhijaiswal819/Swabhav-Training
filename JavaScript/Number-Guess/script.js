const div = document.querySelector("div");
console.log(div);

for (let i = 1; i <= 40; i++) {
    let button = document.createElement("button");
    button.setAttribute("id", i);
    button.classList.add("but");
    button.innerHTML = i;
    div.appendChild(button);
}

function guessTheNumber() {
    let upper = 40;
    let lower = 1;
    let randomNumber = Math.floor(Math.random() * (upper - lower + 1) + lower);
    console.log(randomNumber);
    const buttons = document.querySelectorAll("button");
    console.log(buttons);
    const para = document.querySelector("pre");
    console.log(para);
    para.innerText = `Turns remaining: 6`;
    let turns = 6;
    let count = 0;
    let a = ["Abhi to shuruvat hai", "Kar sakta hai tu", "Himmat mat haar", "Bas 2 turn baki hai", "Kar ya mar"]
    let i=0;
    if (turns > 0) {
        buttons.forEach(button => {
            button.addEventListener("click", e => {
                turns = turns - 1;
                count = count + 1;
                para.innerText = `Turns remaining: ${turns} || ${a[i]}`;
                i++;
                if (turns == 0) {
                    button.id == randomNumber;
                    buttons.forEach(button => button.disabled = true);
                    para.innerText = `Turns remaining: ${turns} || Tumse na ho payega`;
                    alert("You have successfully FAILED!");
                }
                if (button.id < randomNumber) {
                    button.setAttribute("class", "yellow");
                }
                if (button.id > randomNumber) {
                    button.setAttribute("class", "red");
                }
                if (button.id == randomNumber) {
                    button.setAttribute("class", "green");
                    buttons.forEach(button => button.disabled = true);
                    para.innerText = `Shabash kachra! You have guessed the correct number in ${count} turns`;
                }
                // para.innerText = `Turns: ${turns}`;
            })
        })
    }
}

guessTheNumber();