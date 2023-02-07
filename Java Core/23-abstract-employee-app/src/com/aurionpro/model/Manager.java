package com.aurionpro.model;

public class Manager extends Employee {

	private double hra;//= getBasicSalary() * 0.25;
	private double da;//=hra+500;
	private double ta;

	public Manager(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		hra = basicSalary * 0.25;
		da = basicSalary * 0.15;
		ta = basicSalary * 0.1;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	@Override
	public String toString() {
		return "Manager [employeeId=" + this.getEmployeeId() + ", name=" + this.getName() + ", basicSalary=" + this.getBasicSalary() +
				" hra=" + hra + ", da=" + da + ", ta=" + ta + "]";
	}
	
	

	public void setTa(double ta) {
		this.ta = ta;
	}

	@Override
	public double calculateAnnualCTC() {
		return ((this.getBasicSalary() + hra + da + ta) * 12);
	}

	@Override
	public String getAccountDetails() {
		String str="";
		str+="ID : "+getEmployeeId();
		str+="\nName : "+getName();
		str+="\nBasic : "+getBasicSalary();
		str+="\nHRA : "+hra;
		str+="\nDA : "+da;
		str+="\nTA : "+ta;
		return str;
	}
}
