var Customer03 = /** @class */ (function () {
    //using "constructor properties" to declare and initialize class variables
    function Customer03(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Customer03.prototype.setFirstName = function (firstName) {
        this.firstName = firstName;
    };
    Customer03.prototype.setLastName = function (lastName) {
        this.lastName = lastName;
    };
    Customer03.prototype.getFirstName = function () {
        return this.firstName;
    };
    Customer03.prototype.getLastName = function () {
        return this.lastName;
    };
    return Customer03;
}());
var customer3 = new Customer03("Abhi", "Jaiswal");
console.log(customer3.getFirstName());
console.log(customer3.getLastName());
customer3.setFirstName("Abhishek");
customer3.setLastName("Jaiswal");
console.log(customer3.getFirstName());
console.log(customer3.getLastName());
