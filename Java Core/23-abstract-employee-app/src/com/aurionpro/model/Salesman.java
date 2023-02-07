package com.aurionpro.model;

public class Salesman extends Employee {

	private double bonus;// = this.getBasicSalary() * 1.30;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Salesman(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		bonus = basicSalary*0.30;;
	}
	
	@Override
	public String toString() {
		return "Salesman [employeeId=" + this.getEmployeeId() + ", name=" + this.getName() + ", basicSalary=" + this.getBasicSalary() +
				" bonus=" + bonus + "]";
	}
	

	@Override
	public double calculateAnnualCTC() {
		return ((this.getBasicSalary()+bonus)*12);
	}

	@Override
	public String getAccountDetails() {
		String str="";
		str+="ID : "+getEmployeeId();
		str+="\nName : "+getName();
		str+="\nBasic : "+getBasicSalary();
		str+="\nBonus : "+bonus;
		return str;
	}
}
