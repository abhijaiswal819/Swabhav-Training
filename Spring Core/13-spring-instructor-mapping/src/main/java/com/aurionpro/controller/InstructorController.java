package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Instructor;
import com.aurionpro.entity.Instructor_details;
import com.aurionpro.repository.InstructorDetailsRepository;
import com.aurionpro.repository.InstructorRepository;



@RestController
public class InstructorController {
	
	@Autowired
	private InstructorRepository insRepository;
	@Autowired
	private InstructorDetailsRepository insDRepository;
	
	@PostMapping("/saveInstructor")
	public ResponseEntity<String> saveInstructor(@RequestBody List<Instructor> insData){
		insRepository.saveAll(insData);
		return ResponseEntity.ok("Data saved");
	}
	
	@PutMapping("/updateInstructor/{instructor_id}/detailid/{detail_id}")
	public ResponseEntity<String> updateInstructor(@PathVariable long instructor_id, @PathVariable long detail_id){
		Instructor instructor = insRepository.findById(instructor_id).get();
		Instructor_details instructorDetails = insDRepository.findById(detail_id).get();
		instructor.setiDetailsS(instructorDetails);
		insRepository.save(instructor);
		return ResponseEntity.ok("Data updated");
	}
	
	@DeleteMapping("/deleteInstructor/{id}")
	public ResponseEntity<String> deleteInstructor(@PathVariable long id){
		insRepository.deleteById(id);
		return ResponseEntity.ok("Data deleted");
	}
}
