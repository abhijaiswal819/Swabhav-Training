package com.aurionpro.controller;

import java.util.List;

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
import com.aurionpro.entity.Instructor;
import com.aurionpro.entity.Instructor_details;
import com.aurionpro.repository.CourseRepository;
import com.aurionpro.repository.InstructorDetailsRepository;
import com.aurionpro.repository.InstructorRepository;



@RestController
public class InstructorController {
	
	@Autowired
	private InstructorRepository insRepository;
	@Autowired
	private InstructorDetailsRepository insDRepository;
	@Autowired
	private CourseRepository courseRepository;
	
	@PostMapping("/saveInstructor")
	public ResponseEntity<String> saveInstructor(@RequestBody List<Instructor> insData){
		insRepository.saveAll(insData);
		return ResponseEntity.ok("Data saved");
	}
	
	@PutMapping("/updateInstructor/{instructor_id}/detailid/{detail_id}")
	public ResponseEntity<String> updateInstructor(@PathVariable long instructor_id, @PathVariable long detail_id){
		Instructor instructor = insRepository.findById(instructor_id).get();
		Instructor_details instructorDetails = insDRepository.findById(detail_id).get();
		instructor.setDetails(instructorDetails);
		insRepository.save(instructor);
		return ResponseEntity.ok("Instructor Data updated");
	}
	
	@PutMapping("/updateInstructorCourse/{instructor_id}/courseid/{course_id}")
	public ResponseEntity<String> updateInstructorCourse(@PathVariable long instructor_id, @PathVariable long course_id){
		Instructor instructor = insRepository.findById(instructor_id).get();
		List<Course> courses = instructor.getCourses();
		Course course = courseRepository.findById(course_id).get();
		courses.add(course);
		instructor.setCourses(courses);
		insRepository.save(instructor);
		return ResponseEntity.ok("Course Data updated");
	}
	
	@GetMapping("/getInstructorCourse/{instructor_id}")
	public List<Course> getInstructorCourse(@PathVariable long instructor_id){
		Instructor instructor = insRepository.findById(instructor_id).get();
		List<Course> courses = instructor.getCourses();
		return courses;
	}
	
	@GetMapping("/getCourseInstructor/{course_id}")
	public Instructor getCourseInstructor(@PathVariable long course_id){
		Course course = courseRepository.findById(course_id).get();
		Instructor instructor = course.getInstructor();
		return instructor;
//		return instructor.toString();
	}
	
	@DeleteMapping("/deleteInstructor/{id}")
	public ResponseEntity<String> deleteInstructor(@PathVariable long id){
		insRepository.deleteById(id);
		return ResponseEntity.ok("Data deleted");
	}
}
