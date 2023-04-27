class Customer02{
    firstName:string;
    lastName:string;

    constructor(firstName:string,lastName:string){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public setFirstName(firstName:string){
        this.firstName=firstName;
    }

    public setLastName(lastName:string){
        this.lastName=lastName;
    }

    public getFirstName():string{
        return this.firstName;
    }

    public getLastName():string{
        return this.lastName;
    }
}

let customer2=new Customer02("Abhi","Jaiswal");

console.log(customer2.getFirstName());
console.log(customer2.getLastName());

customer2.setFirstName("Abhishek");
customer2.setLastName("Jaiswal");

console.log(customer2.getFirstName());
console.log(customer2.getLastName());