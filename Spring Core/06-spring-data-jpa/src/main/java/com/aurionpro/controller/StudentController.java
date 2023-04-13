package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Student;
import com.aurionpro.service.StudentService;

@RestController
@RequestMapping("/studentapp")
public class StudentController {

	@Autowired // autowired injects the bean
//	private StudentRepository repository;
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> findAllStudents() {
//		return repository.findAllStudents();
		return studentService.findAll();

	}

	@GetMapping("/students/{sid}")
	public Student findStudent(@PathVariable(name = "sid") int id) {
		return studentService.findById(id);
	}

	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		student.setId(0); // to avoid update if we mistakenly give id in postman while adding student
		return studentService.save(student);
	}
	
	@PostMapping("/students/all")
	public List<Student> saveAllStudent(@RequestBody List<Student> studentList) {
		return studentService.saveAll(studentList);
	}

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.save(student);
	}

	@DeleteMapping("/students/{sid}")
	private void deleteStudentById(@PathVariable(name = "sid") int id) {
		studentService.deleteById(id);
	}

	//	@DeleteMapping("/students")
	//	private void deleteAllStudents() {
	//		studentService.deleteAll();
	//
	//	}
}
