import { Shape } from "./shape";

export class Circle implements Shape{
    constructor(private radius:number){
    }

    public calculateArea(): number {
        return Math.PI * Math.pow(this.radius,2);
    }
}