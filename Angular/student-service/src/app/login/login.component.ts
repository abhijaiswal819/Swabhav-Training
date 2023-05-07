import { Component } from '@angular/core';
import { NgForm } from "@angular/forms";
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(
    private route:ActivatedRoute,
    private router:Router
    ){}

  submit(formValue:NgForm){
    console.log(formValue.value);
    console.log();    

    //let i =1;
    if(formValue.value.userName=="abhishek" && formValue.value.password=="jaiswal"){
      this.router.navigate(["student"]);
    }
    else{
    }
  }

}
