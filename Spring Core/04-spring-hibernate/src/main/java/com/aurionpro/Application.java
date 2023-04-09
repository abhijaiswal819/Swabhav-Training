package com.aurionpro;

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
		Student student = new Student("Dhruv", "Joshi", "dhriv@gmail.com");
		Student resultStudent = studentDao.save(student);
		System.out.println(resultStudent);
	}

}
