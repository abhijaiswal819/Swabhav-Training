package com.aurionpro.service;

import org.springframework.data.domain.Sort;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aurionpro.entity.Student;
import com.aurionpro.exception.StudentNotFoundException;
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
		List <Student> studentList = repository.findAll();
		boolean flag = false;
		for(Student x: studentList) {
			if(x.getId()==id) {
				flag=true;
				break;
			}
		}
		if(flag) {
			return repository.findById(id).get();
		}
		else {
			throw new StudentNotFoundException("Student with id "+id+" is not found");
		}
//		return repository.findById(id).get();
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

	@Override
	  public Page<Student> getStudentPagination(int pageNumber, int pageSize) {
	    Pageable pageable = PageRequest.of(pageNumber, pageSize);
	    
	    return repository.findAll(pageable);  
	  }

	  @Override
	  public Page<Student> getStudentPaginationInSort(int pageNumber, int pageSize, String sortProperty) {
	    Pageable pageable = null;
	    if(null!=sortProperty) {
	      pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC, sortProperty);
	    }
	    else {
	     pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC, "name");
	    }
	    return repository.findAll(pageable);  
	  }


//	@Override
//	@Transactional
//	public void deleteAll() {
//		repository.deleteAllStudents();
//	}
}
