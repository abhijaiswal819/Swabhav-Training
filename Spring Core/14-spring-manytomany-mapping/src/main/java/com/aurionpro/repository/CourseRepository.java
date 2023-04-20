package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

	//public Course findByName(String courseName);
}
