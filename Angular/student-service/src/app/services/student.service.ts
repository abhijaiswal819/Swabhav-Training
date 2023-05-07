import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StudentBean } from '../model/studentbean';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http:HttpClient) { }

  public getAllStudents(){
    return this.http.get<StudentBean[]>("http://localhost:8080/studentapp/students");
  }

  public deleteStudentById(id:number){
    return this.http.delete(`http://localhost:8080/studentapp/students/${id}`)
  }

  public getStudentById(id:number){
    return this.http.get<StudentBean>(`http://localhost:8080/studentapp/students/${id}`)
  }

  public updateStudent(student:StudentBean){
    return this.http.put("http://localhost:8080/studentapp/students",student);
  }
}

