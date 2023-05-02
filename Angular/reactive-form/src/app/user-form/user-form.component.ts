import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators,FormControl } from '@angular/forms';



@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  constructor(private formBuilder: FormBuilder){
    
  }

  addUserForm=this.formBuilder.group({
    userName:new FormControl('',[Validators.required,
    Validators.maxLength(10), Validators.minLength(3), Validators.pattern("^[a-zA-Z]*$")]),

    email:new FormControl('',[Validators.required,
      Validators.maxLength(30), Validators.minLength(3), Validators.pattern("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$")]),

      userType:new FormControl(''),

      userGender:new FormControl(''),

      isactive:new FormControl('')
  });

  addUser(){
    console.log(this.addUserForm.value);
  }

  resetUserForm(){
    this.addUserForm.reset();
  }

}
