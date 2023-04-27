var Customer02 = /** @class */ (function () {
    function Customer02(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Customer02.prototype.setFirstName = function (firstName) {
        this.firstName = firstName;
    };
    Customer02.prototype.setLastName = function (lastName) {
        this.lastName = lastName;
    };
    Customer02.prototype.getFirstName = function () {
        return this.firstName;
    };
    Customer02.prototype.getLastName = function () {
        return this.lastName;
    };
    return Customer02;
}());
var customer2 = new Customer02("Abhi", "Jaiswal");
console.log(customer2.getFirstName());
console.log(customer2.getLastName());
customer2.setFirstName("Abhishek");
customer2.setLastName("Jaiswal");
console.log(customer2.getFirstName());
console.log(customer2.getLastName());
