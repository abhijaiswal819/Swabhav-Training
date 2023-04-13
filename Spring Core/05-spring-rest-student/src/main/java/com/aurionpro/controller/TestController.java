package com.aurionpro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/test")
public class TestController {

	List<Student> studentList= new ArrayList<>();
	
	@PostConstruct
	public void init() {
		studentList.add(new Student(1, "Ajay", "Pal", "apal@gmail.com"));
		studentList.add(new Student(2, "Vijay", "Pal", "vpal@gmail.com"));
		studentList.add(new Student(3, "Sujay", "Pal", "spal@gmail.com"));
		studentList.add(new Student(4, "Dinesh", "Pal", "dpal@gmail.com"));	
	}
	
	@GetMapping("/students")
	public List<Student> findAllStudents(){
		return studentList;
	}
	
	@GetMapping("/students/{studId}")
	public Student findStudentById(@PathVariable(name = "studId")int id){
		for (Student x: studentList) {
			if(x.getId()==id) {
				return x;
			}
		}
		return null;
	}
	
//	@GetMapping("/hello")
//	private String showGreetings() {
//		return "Hello all students";
//	}
//	
//	@GetMapping("/welcome")
//	private String showWelcomemessage() {
//		return "Welcome to All students..";
//	}
}
