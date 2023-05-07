import { Component,OnInit } from '@angular/core';
import { NgForm } from "@angular/forms";
import { StudentService } from '../services/student.service';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentBean } from '../model/studentbean';

@Component({
  selector: 'app-saveupdate',
  templateUrl: './saveupdate.component.html',
  styleUrls: ['./saveupdate.component.css']
})
export class SaveupdateComponent implements OnInit {

  student!:StudentBean;

  constructor(
    private studentService: StudentService,
    private route:ActivatedRoute,
    private router:Router
      
  ){}
  
  ngOnInit(): void {
    let studid = this.route.snapshot.params['id'];
    console.log(studid);

    //assigning default value to this student object
    this.student=new StudentBean(1,"AB","JA","ab@");

    this.studentService.getStudentById(studid).subscribe(data=>{
      this.student = data;
      console.log(data);
      
    });
  }

  log(x:any){
    console.log(x.value);
  }

  submit(formValue:NgForm){
    // console.log(formValue.value);
    // console.log(this.student);    
    this.student.firstName=formValue.value.firstName;
    this.student.lastName=formValue.value.lastName;
    this.student.email=formValue.value.email;
    // console.log(this.student);
    this.studentService.updateStudent(this.student).subscribe(data=>{
      this.router.navigate(["student"]);
    });

  }
  
  resetUserForm(formValue:NgForm){
    formValue.reset();
  }
}
