import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {

  title="template-form";

  userName:string='';
  terms:boolean=false;
  userType:string='';
  userGender:string='female';

  log(x:any){
    console.log(x.value);
  }

  submit(formValue:NgForm){
    console.log(formValue.value);
    console.log();    
  }
  
  resetUserForm(formValue:NgForm){
    formValue.reset();
  }

}
