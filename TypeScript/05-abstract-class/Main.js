"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var circle_1 = require("./circle");
var circle = new circle_1.Circle(10, 20, 30);
var shapes = [];
shapes.push(circle);
shapes.forEach(function (shape) {
    console.log("Circle Info " + shape.getInfo());
    console.log("Circle Area " + shape.calculateArea());
    console.log("---------");
});
