package com.aurionpro.entity;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Transactional
@Table(name = "course_table")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private Integer id;
	@Column(name = "name")
    private String name;	
	
//	@ManyToMany(mappedBy = "courses")
//	@JsonIgnore
//	private List<Student> students;

	public Course() {
		super();
	}

//	public Course(Integer id, String name, List<Student> students) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.students = students;
//	}

//	@Override
//	public String toString() {
//		return "Course [id=" + id + ", name=" + name + ", students=" + students + "]";
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}

	
}
