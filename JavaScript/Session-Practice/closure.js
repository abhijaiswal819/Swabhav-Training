/*
Closure : inner function has access to the variables of the outer function
even after the outer function has finished its execution
*/
function outerFunction(outerVariable){
    // const outer = "Hello";
    return function innerFunction(innerVariable){
        console.log("Outer Variable "+outerVariable);
        console.log("Inner Variable "+innerVariable);
    }
}

const myFunc = outerFunction("outside");
myFunc("inside");
