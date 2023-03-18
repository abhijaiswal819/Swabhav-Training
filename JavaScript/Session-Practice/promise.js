const greetMessage = function(){
    return new Promise((resolve,reject)=>{
        resolve("some data");
        //reject("error data");
    })
}

greetMessage().then(data=>{
    console.log(data);
}).catch(err=>{
    console.log(err);
})