const func = async ()=>{
    const response = await fetch("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students");
    if(response.status!=200){
        throw new Error("Invalid url");
    }
    const data = await response.json();
    return data;
    // console.log(data);

    // const response1 = await fetch("abhi.json");
    // const data1 = await response1.json();
    // return data1;
};

func().then((data)=>{
    console.log(data);
    funcToAdd(data);
}).catch(err=>{
    console.log("Could not fetch data "+err);
})

const table = document.querySelector("table");
const funcToAdd =  (data)=>{
    let html =``;
    data.forEach(d => {
        html=`<tr>
        <td>${d.rollNo}</td>
        <td>${d.name}</td>
        <td>${d.email}</td>
        <td>${d.date}</td>
        <td>${d.age}</td>
        </tr>`
        table.innerHTML+=html;
        });
}