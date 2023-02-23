package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "RAM", Arrays.asList("Singing", "Cooking", "Dancing")),
				new Student(102, "KAM", Arrays.asList("Cricket", "Dancing")),
				new Student(101, "JAM", Arrays.asList("Acting", "Dancing")));

		List<String> collect = students.stream().map(n->n.getName()).distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		//FlatMap only works for List of List
		List<String> collect2 = students.stream().flatMap(n->n.getHobbies().stream()).distinct().filter(n->n.endsWith("ing")).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
