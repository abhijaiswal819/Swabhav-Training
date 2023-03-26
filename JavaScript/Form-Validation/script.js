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
            return true;
        }
        else {
            alert("⛔️ Name Invalid")
        }
    }

    EmailCheck = (email) => {
        var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{3,4})+$/;
        if (email.match(mailformat) && email != "") {
            return true;
        }
        else {
            alert("⛔️ Email Invalid")
        }
    }

    AgeCheck = (age) => {
        if (age > 0 && age < 100 && age !="") {
            return true;
        }
        else {
            alert("⛔️ Age Invalid")
        }
    }

    PhoneCheck = (phone) => {
        var phoneformat = /^\(?([7-9]{3})\)?([0-9]{3})?([0-9]{4})$/;
        if (phone.match(phoneformat) && phone != "") {
            return true;
        }
        else {
            alert("⛔️ Phone Invalid")
        }
    }

    PassCheck = (pass) => {
        var passformat=  /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
        if (pass.match(passformat) && pass != "") {
            return true;
        }
        else {
            alert("⛔️ Password Invalid")
        }
    }

    CPassCheck = (pass,cpass) => {
        if (pass === cpass && cpass !="" ) {
            return true;
        }
        else {
            alert("⛔️ Password Not Matched")
        }
    }

    if(NameCheck(name.value) && EmailCheck(email.value) && AgeCheck(age.value) && PhoneCheck(phone.value) && PassCheck(pass.value) && CPassCheck(pass.value,cpass.value)){
        const data ={
            name : name.value,
            email : email.value,
            age : age.value,
            phone : phone.value,
            pass : pass.value,
            cpass : cpass.value
        }
        localStorage.setItem("User Data", JSON.stringify(data) );
    }
}