//we can not do DOM specific task here
self.onmessage=(message)=>{
    // console.log(message.data);
    // alert(message.data);
    let sum = 0;
    for(let i=1;i<=1000000000;i++){
        sum+=i;
    }
    postMessage(sum);
}