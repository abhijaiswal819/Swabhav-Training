import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  //property binding
  itemImageUrl = '../assets/phone.jpg';
  isUnchanged=true;

  //Two way binding using Property and Event binding
  name="";
  clearName(){
    this.name="";
  }

  //Two way bindng using ngModel
  test="";
  clearText(){
    this.name="";
  }

  //Two way bindng using id
  paraDisplay:string="";
  getValue(text:string){
    this.paraDisplay=text;
  }

  //Addition of two numbers
  totalSum="";
  getNum(text:string, text2:string){
    this.totalSum=String((parseInt(text) || 0) + (parseInt(text2) || 0));
  }

  //Addition of two numbers using ngModel
  test1="";
  test2="";
  totalSumValue=""
  getSum(){
   this.totalSumValue= String((parseInt(this.test1) || 0) + (parseInt(this.test2) || 0));
  }

  //For Loop
  items=[10,20,30]
  itemsS:string[]=["Abhi", "Akshay", "Tejas"]

  //If else
  show:boolean=false;

  //If-elseIf ladder
  color:string="blue";

  //Array of Objects
  topBatsmanDetails=[
    {name:"Virat",matches:200,runs:20000,country:"India"},
    {name:"Rohit",matches:100,runs:15000,country:"India"},
    {name:"Surya",matches:90,runs:7000,country:"India"},
    {name:"Pant",matches:120,runs:12000,country:"India"}
  ];

  //Nested For
  scoreDetails=[
    {name:"Virat",matches:200,lastFiveInnings:[20,30,40,50,30]},
    {name:"Rohit",matches:100,lastFiveInnings:[20,30,40,50,10]},
    {name:"Surya",matches:90,lastFiveInnings:[20,30,40,50,20]},
    {name:"Pant",matches:120,lastFiveInnings:[20,30,40,50,15]}
  ];

  //Printing player details with total scores
  calculateTotalScore(scores:number[]):number{
    let score=scores.reduce( (acc,val)=>{
      return acc+val;
    },0)
  return score;
  }

  //Style Binding changing styles of element dynamically
  fontColor:string="green";
  bgColor:string="blue";
  toggleColor(){
    if(this. fontColor ==="blue"){
      this.fontColor="green";
      this.bgColor="blue";
    }
     else{
      this.fontColor="blue";
      this.bgColor="green";
   }
  }

  //TODO-App
  todoList:any[]= [];
  id:number=0;

  insertValue(todo:string){
    if(todo!=""){
      this.todoList.push({"id":this.id, "task":todo})
      this.id+=1
    }
  };
  
  deleteTask(taskId:number){    
    this.todoList.splice(this.todoList.indexOf(taskId),1)
  }

  //PIPES
  pipeTitle='Angular Pipes Demo';
  pipeArray=[10,30,20,40,60,34,70];
  today:number = Date.now();
  user={name:"Abhi",age:20,city:"Mumbai"};
  pipeValue=133.456888;

  //Custom Pipes
}
