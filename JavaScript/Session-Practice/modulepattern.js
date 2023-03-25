/*
Module Pattern
1. It is used to wrap set of variables and functions in a single scope
2. Using module pattern, we can create objects and specify the variables and function
   that can be accessed from outside the scope of function
3. Data hiding can be achieved using module pattern
*/

function createCustomer(){
    let customer = {};

    let id, name;

    customer.setId = function(id){
        _id = id;
    }
    customer.setName = function(name){
        _name = name;
    }
    customer.getDetails = function(){
        return "ID :"+_id+" and Name :"+_name;
    }
    return customer;
}

let customer = createCustomer();
customer.setId(10);
customer.setName("Ramesh");
console.log(customer);
console.log(customer.getDetails());