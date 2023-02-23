package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "RAM", 120000);
		emp.calculateTax();
		emp.printSalarySlip();
	}

}
