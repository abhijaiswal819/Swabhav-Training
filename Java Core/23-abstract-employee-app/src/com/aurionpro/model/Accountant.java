package com.aurionpro.model;

public class Accountant extends Employee {

	private double performanceAllowance;// = this.getBasicSalary() * 1.15;

	public double getPerformanceAllowance() {
		return performanceAllowance;
	}

	public void setPerformanceAllowance(double performanceAllowance) {
		this.performanceAllowance = performanceAllowance;
	}

	public Accountant(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		performanceAllowance = basicSalary*0.15;
	}

	@Override
	public String toString() {
		return "Accountant [employeeId=" + this.getEmployeeId() + ", name=" + this.getName() + ", basicSalary=" + this.getBasicSalary() +
				" performanceAllowance=" + performanceAllowance + "]";
	}
	
	@Override
	public double calculateAnnualCTC() {
		return ((this.getBasicSalary()+performanceAllowance)*12);
	}

	@Override
	public String getAccountDetails() {
		String str="";
		str+="ID : "+getEmployeeId();
		str+="\nName : "+getName();
		str+="\nBasic : "+getBasicSalary();
		str+="\nPerformance Allowance : "+performanceAllowance;
		return str;
	}
}
