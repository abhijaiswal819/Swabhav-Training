var Customer = /** @class */ (function () {
    function Customer(firstName, lastName) {
        this.firstNmae = firstName;
        this.lastName = lastName;
    }
    return Customer;
}());
var customer = new Customer("Abhi", "Jaiswal");
console.log(customer.firstNmae);
console.log(customer.lastName);
