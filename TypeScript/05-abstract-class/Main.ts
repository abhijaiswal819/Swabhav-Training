import { Circle } from "./circle";
import { Shape } from "./shape";

let circle = new Circle(10,20,30);

let shapes:Shape[]=[];

shapes.push(circle);

shapes.forEach(shape=>{
    console.log("Circle Info "+shape.getInfo());
    console.log("Circle Area "+shape.calculateArea());
    console.log("---------");
});