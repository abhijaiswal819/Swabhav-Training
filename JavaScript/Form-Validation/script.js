// const btn = document.getElementsByTagName("button");

function validateform() {
    // alert("Checking")
    const name = document.getElementById("name");
    const email = document.getElementById("email");
    const age = document.getElementById("age");
    const phone = document.getElementById("phone");
    const pass = document.getElementById("pass");
    const cpass = document.getElementById("cpass");

    NameCheck = (name) => {
        var expr = /^[0-9a-zA-Z]+$/
        if (name.match(expr) && name != "") {
        }
        else {
            alert("⛔️ Name Invalid")
        }
    }
    NameCheck(name.value);

    EmailCheck = (email) => {
        var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{3,4})+$/;
        if (email.match(mailformat) && email != "") {
        }
        else {
            alert("⛔️ Email Invalid")
        }
    }
    EmailCheck(email.value);

    AgeCheck = (age) => {
        if (age > 0 && age < 100 && age !="") {
        }
        else {
            alert("⛔️ Age Invalid")
        }
    }
    AgeCheck(age.value);

    PhoneCheck = (phone) => {
        var phoneformat = /^\(?([7-9]{3})\)?([0-9]{3})?([0-9]{4})$/;
        if (phone.match(phoneformat) && phone != "") {
        }
        else {
            alert("⛔️ Phone Invalid")
        }
    }
    PhoneCheck(phone.value);

    PassCheck = (pass) => {
        var passformat=  /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
        if (pass.match(passformat) && pass != "") {
        }
        else {
            alert("⛔️ Password Invalid")
        }
    }
    PassCheck(pass.value);

    CPassCheck = (pass,cpass) => {
        if (pass === cpass && cpass !="" ) {
        }
        else {
            alert("⛔️ Password Not Matched")
        }
    }
    CPassCheck(pass.value,cpass.value);
}