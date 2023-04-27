//export means making this class public
export class Customer04{

    //using "constructor properties" to declare and initialize class variables
    constructor(private firstName:string, private lastName:string){
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

// let customer3=new Customer03("Abhi","Jaiswal");

// console.log(customer3.getFirstName());
// console.log(customer3.getLastName());

// customer3.setFirstName("Abhishek");
// customer3.setLastName("Jaiswal");

// console.log(customer3.getFirstName());
// console.log(customer3.getLastName());