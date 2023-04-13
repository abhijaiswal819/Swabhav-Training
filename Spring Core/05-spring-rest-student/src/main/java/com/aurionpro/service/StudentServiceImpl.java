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
	public List<Student> findAllStudents() {
		return repository.findAllStudents();
	}

	@Override
	public Student findStudentById(int id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public Student saveStudent(Student student) {
		return repository.saveStudent(student);
	}

	@Override
	@Transactional
	public Student updateStudent(Student student) {
		return repository.saveStudent(student);
	}

	@Override
	@Transactional
	public void deleteStudentById(int id) {
		repository.deleteStudentById(id);

	}

	@Override
	@Transactional
	public void deleteAll() {
		repository.deleteAllStudents();
	}
}
