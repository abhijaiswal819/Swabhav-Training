"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var circle_1 = require("./circle");
var shape_1 = require("./shape");
var shape = new shape_1.Shape(10, 20);
console.log(shape.getInfo());
var circle = new circle_1.Circle(10, 20, 30);
console.log(circle.getInfo());
