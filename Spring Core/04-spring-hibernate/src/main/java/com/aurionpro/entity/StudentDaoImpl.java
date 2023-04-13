package com.aurionpro.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aurionpro.dao.StudentDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

@Repository // for creation of bean just like component in spring
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private EntityManager manager;

	@Override
	@Transactional
	public Student save(Student student) {
		manager.persist(student);// for saving student object in db
		// manager.merge(student);//for saving student object in db
		return manager.find(Student.class, student.getId());
	}

	@Override
	public Student findById(int id) {
		return manager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		TypedQuery<Student> query = manager.createQuery("select e from Student e", Student.class);
		return query.getResultList();
	}

	@Override
	public List<Student> findByFirstName(String firstName) {
		TypedQuery<Student> query = manager.createQuery("select e from Student e where e.firstname=:theFirstName",
				Student.class);
		query.setParameter("theFirstName", firstName);
		return query.getResultList();
	}

	@Override
	public Student findByEmail(String email) {
		TypedQuery<Student> query = manager.createQuery("select e from Student e where e.email=:theEmail",
				Student.class);
		query.setParameter("theEmail", email);
		Student temp = null;
		try {
			temp = query.getSingleResult();
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
//		System.out.println(temp);
		return temp;// returns only one row on the basis of first come
	}

	@Override
	@Transactional // for save and update we need to add transactional entity
	public void update(Student student) {
//		Student student1 = manager.merge(student);
//		System.out.println(student1);
		Query query = manager.createQuery(
				"update Student set firstname=:theFirstName, lastname=: theLastName, email=:theEmail where id =:theId");
		query.setParameter("theFirstName", student.getFirstname());
		query.setParameter("theLastName", student.getLastname());
		query.setParameter("theEmail", student.getEmail());
		query.setParameter("theId", student.getId());
		
		query.executeUpdate();

	}

	@Override
	@Transactional
	public void delete(Student student) {
//		Student student = manager.find(student.class, id)
//		manager.remove(student);
		manager.remove(manager.contains(student) ? student : manager.merge(student));
	}

	@Override
	@Transactional
	public void deleteAll() {
		int rows = manager.createQuery("delete from Student").executeUpdate();
		System.out.println(rows);

	}

}
