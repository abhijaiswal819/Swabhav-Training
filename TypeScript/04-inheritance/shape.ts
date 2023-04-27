export class Shape{
    constructor(private x:number,private y:number){
    }

    public getInfo():string{
        return `x=${this.x} and y=${this.y}`;
    }
}