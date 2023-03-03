package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	Employee obj;// = new Employee(101, "RAM", 1000);

	@BeforeEach
	void init() {
		obj = new Employee(101, "RAM", 1000);
		System.out.println("Before Each");
	}
	
	@Test
	void testGetHra() {
		assertEquals(200.0, obj.getHra());
		//System.out.println(obj.obj.getHra());
	}
	
	@Test
	void testGetDa() {
//		obj.setHra(2000);
//		obj.setDa(1000);
		assertEquals(150.0, obj.getDa());
		//System.out.println(obj.getDa());
	}
	
	@Test
	void testGetTa() {
		assertEquals(100.0, obj.getTa());
		//System.out.println(obj.getTa());
	}
	
	@Test
	void testCalculateAnnualCTC() {
		assertEquals(17400.0, obj.calculateAnnualCTC());
		//System.out.println(obj.calculateAnnualCTC());
	}
	
	@Test
	void testCalculateMonthlySalary() {
		assertEquals(1450.0, obj.calculateMonthlySalary());
		//System.out.println(obj.calculateMonthlySalary());
	}
}
