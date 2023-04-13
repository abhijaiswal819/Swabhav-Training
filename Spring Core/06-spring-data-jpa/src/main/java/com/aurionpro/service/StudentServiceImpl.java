package com.aurionpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aurionpro.entity.Student;
import com.aurionpro.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> findAll() {
		return repository.findAll();
	}

	@Override
	public Student findById(int id) {
		return repository.findById(id).get();
	}

	@Transactional
	@Override
	public Student save(Student student) {
		return repository.save(student);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		repository.deleteById(id);

	}

	@Override
	public List<Student> saveAll(List<Student> studentList) {
		return repository.saveAll(studentList);
	}

//	@Override
//	@Transactional
//	public void deleteAll() {
//		repository.deleteAllStudents();
//	}
}
