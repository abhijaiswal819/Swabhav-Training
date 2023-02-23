package com.aurionpro.model;

public class SalarySlipPrinter {
	
	public void printSalarySlip(Employee emp) {
		System.out.println("Id: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Tax: "+new Tax().calculateTax(emp));
	}
}
