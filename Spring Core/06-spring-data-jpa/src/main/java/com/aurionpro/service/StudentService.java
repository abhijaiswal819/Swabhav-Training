package com.aurionpro.service;

import java.util.List;

import com.aurionpro.entity.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int id);

	Student save(Student student);
	
	List<Student> saveAll(List<Student> studentList);

//	Student updateStudent(Student student);

	void deleteById(int id);

//	void deleteAll();

}
