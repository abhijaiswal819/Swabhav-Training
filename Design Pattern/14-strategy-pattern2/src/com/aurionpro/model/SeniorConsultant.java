package com.aurionpro.model;

public class SeniorConsultant implements IRole {

	@Override
	public String description() {
		return "I am Senior Consultant.";
	}

	@Override
	public String responsibility() {
		return "I do senior consultant duty.";
	}
}
