package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();

		map.put(101, new Employee(101, 200000, "RAM"));
		map.put(102, new Employee(102, 250000, "KAM"));
		map.put(103, new Employee(103, 400000, "JAM"));

		System.out.println(map);
		
		System.out.println();
		for (Entry<Integer, Employee> set: map.entrySet()) {
			System.out.println(set.getKey()+" : "+set.getValue());
		}
		
		System.out.println();
		map.forEach((key,value)->System.out.println(key+" : "+value));
	}

}
