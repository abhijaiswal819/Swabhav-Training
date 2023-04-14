package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Student;
import com.aurionpro.exception.NoStudentRecordFoundException;
import com.aurionpro.exception.StudentErrorResponse;
import com.aurionpro.exception.StudentNotFoundException;
import com.aurionpro.service.StudentService;

@RestController
@RequestMapping("/studentapp")
public class StudentController {

	@Autowired // autowired injects the bean
//	private StudentRepository repository;
	private StudentService studentService;

	@GetMapping("/students")
	public ResponseEntity<List<Student>> findAllStudents() {
		List<Student> studentList = studentService.findAll();
		if (studentList.size() == 0) {
			throw new NoStudentRecordFoundException("No record was found...");
		}
		return new ResponseEntity<>(studentList, HttpStatus.OK);
//		return repository.findAllStudents();
//		return studentService.findAll();

	}

	@GetMapping("/students/{sid}")
	public ResponseEntity<Student> findStudent(@PathVariable(name = "sid") int id) {
		Student student = studentService.findById(id);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@PostMapping("/students")
	public ResponseEntity<Student> saveStudent(@RequestBody Student stud) {
		stud.setId(0); // to avoid update if we mistakenly give id in postman while adding student
		Student student = studentService.save(stud);
		return new ResponseEntity<>(student, HttpStatus.CREATED);
	}

	@PostMapping("/students/all")
	public ResponseEntity<List<Student>> saveAllStudent(@RequestBody List<Student> studentList) {
		List<Student> student = studentService.saveAll(studentList);
		return new ResponseEntity<>(student, HttpStatus.CREATED);
	}

	@PutMapping("/students")
	public ResponseEntity<Student> updateStudent(@RequestBody Student stud) {
		Student student = studentService.save(stud);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@DeleteMapping("/students/{sid}")
	private ResponseEntity<?> deleteStudentById(@PathVariable(name = "sid") int id) {
		studentService.deleteById(id);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	// @DeleteMapping("/students")
	// private void deleteAllStudents() {
	// studentService.deleteAll();
	//
	// }

//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
//
//		// create a Student Error Message
//		StudentErrorResponse error = new StudentErrorResponse();
//
//		error.setStatus(HttpStatus.NOT_FOUND.value());
//		error.setMessage(exc.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//
//		// return ResponseEntity
//
//		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//	}
//
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
//
//		// create a Student Error Message
//		StudentErrorResponse error = new StudentErrorResponse();
//
//		error.setStatus(HttpStatus.BAD_REQUEST.value());
//		error.setMessage(exc.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//
//		// return ResponseEntity
//
//		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//	}
//	
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(NoStudentRecordFoundException exc) {
//
//		// create a Student Error Message
//		StudentErrorResponse error = new StudentErrorResponse();
//
//		error.setStatus(HttpStatus.NOT_FOUND.value());
//		error.setMessage(exc.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//
//		// return ResponseEntity
//
//		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//	}
}
