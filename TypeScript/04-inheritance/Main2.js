"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var circle_1 = require("./circle");
var circle = new circle_1.Circle(10, 20, 30);
var circle2 = new circle_1.Circle(10, 20, 40);
var shapes = [];
shapes.push(circle);
shapes.push(circle2);
shapes.forEach(function (shape) {
    console.log(shape.getInfo());
    console.log("---------");
});
