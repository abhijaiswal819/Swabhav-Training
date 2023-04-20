package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
