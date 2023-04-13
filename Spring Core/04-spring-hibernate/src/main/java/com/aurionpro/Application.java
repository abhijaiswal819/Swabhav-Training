package com.aurionpro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aurionpro.dao.StudentDao;
import com.aurionpro.entity.Student;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 1. Adding a new student
//		addNewStudent();

		// 2. find student by id
//		Student student = findStudentById(100);
//		System.out.println(student);

		// 3. find all students
//		List<Student> students = findAllStudents();
//		System.out.println(students);

		// 4. find student by firstName
//		List<Student> students = findByFirstName("Dhruv");
//		System.out.println(students);

//		 5. find student by email
//		Student students = findByEmail("akshaypoojary@example.com");
//		System.out.println(students);

		// 6. update student by id
		updateStudentById(8);
//		System.out.println(student);

		// 7. delete student by id
		//deleteStudentById(2);

		// 8. delete student by id
//		deleteStudent();
	}

	private void deleteStudent() {
		studentDao.deleteAll();
	}

	private void deleteStudentById(int id) {
		Student student = studentDao.findById(id);
		System.out.println(student);
		studentDao.delete(student);
	}

	private void updateStudentById(int id) {
		Student student = new Student(8, "Teju", "Prabhu", "tejasprabhu@example.com");
		studentDao.update(student);
	}

	private Student findByEmail(String email) {
		return studentDao.findByEmail(email);
	}

	private List<Student> findByFirstName(String firstName) {
		return studentDao.findByFirstName(firstName);
	}

	private List<Student> findAllStudents() {

		return studentDao.findAll();
	}

	private Student findStudentById(int id) {
		return studentDao.findById(id);
	}

	private void addNewStudent() {
		Student student = new Student("Dhruv", "Joshi", "dhriv@gmail.com");
		Student resultStudent = studentDao.save(student);
		System.out.println(resultStudent);
	}

}
