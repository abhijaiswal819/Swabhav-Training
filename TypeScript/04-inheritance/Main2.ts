import { Circle } from "./circle";
import { Shape } from "./shape";

let circle = new Circle(10,20,30);
let circle2=new Circle(10,20,40);

let shapes:Shape[]=[];

shapes.push(circle);
shapes.push(circle2);

shapes.forEach(shape=>{
    console.log(shape.getInfo());
    console.log("---------");
})