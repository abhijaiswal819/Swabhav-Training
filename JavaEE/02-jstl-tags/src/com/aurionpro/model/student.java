package com.aurionpro.model;

public class student {

	private String name;
	private int rollno;
	private boolean scholarship;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public boolean isScholarship() {
		return scholarship;
	}
	public void setScholarship(boolean scholarship) {
		this.scholarship = scholarship;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public student(String name, int rollno, boolean scholarship, String email) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.scholarship = scholarship;
		this.email = email;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + ", scholarship=" + scholarship + ", email=" + email
				+ "]";
	}
	
	
}
