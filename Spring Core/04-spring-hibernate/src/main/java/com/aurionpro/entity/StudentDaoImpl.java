package com.aurionpro.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aurionpro.dao.StudentDao;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private EntityManager manager;

	@Override
	@Transactional
	public Student save(Student student) {
		manager.persist(student);
		return manager.find(Student.class, student.getId());
	}

}
