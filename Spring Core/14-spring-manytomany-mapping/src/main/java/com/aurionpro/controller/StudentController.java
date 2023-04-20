package com.aurionpro.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Course;
import com.aurionpro.entity.Student;
import com.aurionpro.repository.CourseRepository;
import com.aurionpro.repository.StudentRepository;
import com.aurionpro.service.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        System.out.println(students);
        return students;
    }
	
	@GetMapping("/students/{student_id}")
    public Optional<Student> getAllStudents(@PathVariable Integer student_id) {
        Optional<Student> students = studentRepository.findById(student_id);
        System.out.println(students);
        return students;
    }
	
	@PostMapping("/savestudent")
    public ResponseEntity<String> saveStudent(@RequestBody List<Student> stData) {
		System.out.println(stData);
		studentRepository.saveAll(stData);
		return ResponseEntity.ok("Data saved");
    }
    
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		studentRepository.deleteById(id);
		return ResponseEntity.ok("Data deleted");
	}
	
//	public List<Course> getInstructorCourse(@PathVariable long instructor_id){
//		Instructor instructor = insRepository.findById(instructor_id).get();
//		List<Course> courses = instructor.getCourses();
//		return courses;
//	}
//	
//	@GetMapping("/getCourseInstructor/{course_id}")
//	public Instructor getCourseInstructor(@PathVariable long course_id){
//		Course course = courseRepository.findById(course_id).get();
//		Instructor instructor = course.getInstructor();
//		return instructor;
////		return instructor.toString();
//	}
//	
//	@PostMapping("/saveInstructor")
//	public ResponseEntity<String> saveInstructor(@RequestBody List<Instructor> insData){
//		insRepository.saveAll(insData);
//		return ResponseEntity.ok("Data saved");
//	}
//	
//	@PutMapping("/updateInstructor/{instructor_id}/detailid/{detail_id}")
//	public ResponseEntity<String> updateInstructor(@PathVariable long instructor_id, @PathVariable long detail_id){
//		Instructor instructor = insRepository.findById(instructor_id).get();
//		Instructor_details instructorDetails = insDRepository.findById(detail_id).get();
//		instructor.setDetails(instructorDetails);
//		insRepository.save(instructor);
//		return ResponseEntity.ok("Instructor Data updated");
//	}
//	
//	@PutMapping("/updateInstructorCourse/{instructor_id}/courseid/{course_id}")
//	public ResponseEntity<String> updateInstructorCourse(@PathVariable long instructor_id, @PathVariable long course_id){
//		Instructor instructor = insRepository.findById(instructor_id).get();
//		List<Course> courses = instructor.getCourses();
//		Course course = courseRepository.findById(course_id).get();
//		courses.add(course);
//		instructor.setCourses(courses);
//		insRepository.save(instructor);
//		return ResponseEntity.ok("Course Data updated");
//	}
//	
//	@GetMapping("/getInstructorCourse/{instructor_id}")
//	
//	
//	@DeleteMapping("/deleteInstructor/{id}")
//	public ResponseEntity<String> deleteInstructor(@PathVariable long id){
//		insRepository.deleteById(id);
//		return ResponseEntity.ok("Data deleted");
//	}
}
