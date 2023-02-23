package com.aurionpro.test;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Employee;

public class MinMaxTest {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(
				new Employee(101, "RAM", 10000, "ABC"),
				new Employee(102, "KAM", 12000, "LMN"),
				new Employee(103, "JAM", 5000, "PQR"),
				new Employee(104, "SAM", 56000, "XYZ"));
		
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println(numList.stream().reduce(0, (total, e) -> Integer.sum(total, e)));
		System.out.println(numList.stream().reduce(0, (Integer::sum)));
		System.out.println(numList.stream().map(String::valueOf).reduce("", (carry, str) -> carry.concat(str).concat(" ")));
		System.out.println(numList.stream().map(String::valueOf).reduce("", (String::concat)));
		System.out.println();
		
//		Optional<Employee> listR = emps.parallelStream().reduce((str1, str2)->str1);
//		System.out.println(listR);
		Optional<Employee> listF = emps.parallelStream().findFirst();
		System.out.println(listF);
		Optional<Employee> listA = emps.parallelStream().findAny();
		System.out.println(listA);
		
		System.out.println("Employee with Minimum Salary: ");
		emps.parallelStream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		System.out.println("Employee with Maximum Salary: ");
		//emps.parallelStream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		Optional<Employee> max = emps.parallelStream().max(Comparator.comparing(Employee::getSalary));
		if(max.isPresent()) {
			System.out.println(max.get());
		}

	}

}
