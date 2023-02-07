package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Salesman;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager manager = new Manager(101, "RAM", 40000);
		printSalaryDetails(manager);
		Salesman salesman = new Salesman(201, "Shyam", 20000);
		printSalaryDetails(salesman);
		Accountant accountant = new Accountant(301, "Dhanshaym", 30000);
		printSalaryDetails(accountant);
	}

	private static void printSalaryDetails(Employee obj) {
		//System.out.println(obj);
		System.out.println(obj.getAccountDetails());
		System.out.println("Annual CTC is "+obj.calculateAnnualCTC());
		System.out.println();
	}

}
