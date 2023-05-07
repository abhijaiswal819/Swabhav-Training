import { Component,OnInit } from '@angular/core';
import { StudentService } from '../services/student.service';
import { StudentBean } from '../model/studentbean';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit{

  student:StudentBean[]=[];

  constructor(private studentService: StudentService,
    private route:ActivatedRoute,
    private router:Router
    ){}

  ngOnInit(): void {
    this.getAllStudents();
  }

  getAllStudents(){
    //console.log(this.studentService.getAllStudents());
    this.studentService.getAllStudents().subscribe(data=>{
      //console.log(data);
      this.student=data;
      console.log(this.student);
      
    });
  }

  deleteStudent(id:number){
    console.log(id);
    this.studentService.deleteStudentById(id).subscribe(data=>{
      console.log(data);
      this.getAllStudents();
    });
  }

  updateStudent(id:number){
    console.log(id);
    this.router.navigate(["saveupdate",id]);
  }
}
