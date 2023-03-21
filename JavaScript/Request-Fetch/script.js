function startF() {
    const func = async () => {
        const response = await fetch("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students");
        if (response.status != 200) {
            throw new Error("Invalid url");
        }
        const data = await response.json();
        return data;
    };
    
    func().then((data) => {
        console.log(data);
        funcToAdd(data);
    }).catch(err => {
        console.log("Could not fetch data " + err);
    })
    
    const table = document.querySelector("table");

    const funcToAdd = (data) => {
        let html = ``;
        table.innerHTML = html;
        data.forEach(d => {
            html = `<tr>
            <td>${d.rollNo}</td>
            <td>${d.name}</td>
            <td>${d.age}</td>
            <td>${d.email}</td>        
            <td><button class="btn btn-primary" id="${d.id}" value="Delete" onclick="deleStudent(this)"> Delete </button></td>
            </tr>`
            table.innerHTML += html;
        });
    }
}
startF();

const form = document.querySelector("#myForm");
let name = document.querySelector("#name");
let rollNo = document.querySelector("#roll");
let age = document.querySelector("#age");
let email = document.querySelector("#email");

form.addEventListener('submit', async (e) => {
    e.preventDefault();
    const newStudent = {
        rollNo: rollNo.value,
        name: name.value,
        age: age.value,
        email: email.value
    };
    // let html = ``;
    // html = `<tr>
    //     <td>${newStudent.rollNo}</td>
    //     <td>${newStudent.name}</td>
    //     <td>${newStudent.age}</td>
    //     <td>${newStudent.email}</td>        
    //     <td><button class="btn btn-primary" id="${newStudent.id}" value="Delete" onclick="deleStudent(this)"> Delete </button></td>
    //     </tr>`
    // table.innerHTML += html;
    const createdStudent = await createStudent(newStudent);
    console.log(createStudent);
});

const createStudent = async (s) => {
    const response = await fetch("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students", {
        method: 'POST',
        body: JSON.stringify(
            {
                rollNo: s.rollNo,
                name: s.name,
                age: s.age,
                email: s.email
            }
        ),
        headers: { 'Content-Type': 'application/json; charset=UTF-8' }
    });
    const student = await response.json();
    startF();
    return student;
};

function deleStudent(student) {

    var url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
    var id = student.id;
    fetch(`${url}/${id}`, {
        method: 'DELETE'
    })
        .then(res => res.json)
    var node = student.parentNode.parentNode;
    node.remove()
}