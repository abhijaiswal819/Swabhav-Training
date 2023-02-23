package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;
import com.aurionpro.model.Student;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(
				new Employee(101, "RAM", 10000, "ABC"),
				new Employee(102, "KAM", 12000, "LMN"),
				new Employee(103, "JAM", 5000, "PQR"),
				new Employee(104, "SAM", 56000, "XYZ"));
		
		List<Double> collect = emps.stream().map(n->n.getSalary()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = emps.stream().map(n->n.getDepartment()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);
		
		System.out.println();
		List<Employee> collect3 = emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(collect3);
		
		System.out.println();
		List<Employee> collect4 = emps.stream().sorted(Comparator.comparing(Employee::getDepartment).reversed()).collect(Collectors.toList());
		System.out.println(collect4);
		
		System.out.println();
		List<Employee> collect5 = emps.stream().sorted(Comparator.comparing(Employee::getDepartment).reversed().thenComparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(collect5);
		
		//Stream is for smaller List & ParallelStream is for larger List
	}

}
