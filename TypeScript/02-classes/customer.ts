class Customer{
    firstNmae:string;
    lastName:string;

    constructor(firstName:string,lastName:string){
        this.firstNmae=firstName;
        this.lastName=lastName;
    }
}

let customer=new Customer("Abhi","Jaiswal");

console.log(customer.firstNmae);
console.log(customer.lastName);