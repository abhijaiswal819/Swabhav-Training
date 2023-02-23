package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.SalarySlipPrinter;
import com.aurionpro.model.Tax;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "RAM", 120000);
		//new Tax().calculateTax(emp);
		new SalarySlipPrinter().printSalarySlip(emp);
		
		//System.out.println("Tax: "+new Tax().calculateTax(emp));
	}

}
