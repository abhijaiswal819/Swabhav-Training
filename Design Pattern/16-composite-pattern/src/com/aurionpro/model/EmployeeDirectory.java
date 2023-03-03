package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee {

	List<IEmployee> employees;

	public EmployeeDirectory() {
		super();
		this.employees = new ArrayList<IEmployee>();
	}

	public void addEmployee(IEmployee employee) {
		employees.add(employee);
	}

	public void removemployee(IEmployee employee) {
		int index = 0;
		for (IEmployee x : employees) {
			if (x.getClass().getSimpleName() == employee.getClass().getSimpleName()) {
				employees.remove(index);
			}
			index++;
		}

	}

	@Override
	public void showEmployeeDetails() {
		for (IEmployee x : employees) {
			System.out.println(x);
		}
	}

	@Override
	public String toString() {
		return "EmployeeDirectory [employees=" + employees + "]";
	}

	
}
