"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Customer04 = void 0;
//export means making this class public
var Customer04 = /** @class */ (function () {
    //using "constructor properties" to declare and initialize class variables
    function Customer04(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Customer04.prototype.setFirstName = function (firstName) {
        this.firstName = firstName;
    };
    Customer04.prototype.setLastName = function (lastName) {
        this.lastName = lastName;
    };
    Customer04.prototype.getFirstName = function () {
        return this.firstName;
    };
    Customer04.prototype.getLastName = function () {
        return this.lastName;
    };
    return Customer04;
}());
exports.Customer04 = Customer04;
// let customer3=new Customer03("Abhi","Jaiswal");
// console.log(customer3.getFirstName());
// console.log(customer3.getLastName());
// customer3.setFirstName("Abhishek");
// customer3.setLastName("Jaiswal");
// console.log(customer3.getFirstName());
// console.log(customer3.getLastName());
