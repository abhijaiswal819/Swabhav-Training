"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var circle_1 = require("./circle");
var circle = new circle_1.Circle(30);
var circle1 = new circle_1.Circle(40);
var shapes = [];
shapes.push(circle);
shapes.push(circle1);
shapes.forEach(function (shape) {
    console.log("Circle Area " + shape.calculateArea());
    console.log("---------");
});
