import { Circle } from "./circle";
import { Shape } from "./shape";

let circle = new Circle(30);
let circle1 = new Circle(40);

let shapes:Shape[]=[];

shapes.push(circle);
shapes.push(circle1)

shapes.forEach(shape=>{
    console.log("Circle Area "+shape.calculateArea());
    console.log("---------");
});