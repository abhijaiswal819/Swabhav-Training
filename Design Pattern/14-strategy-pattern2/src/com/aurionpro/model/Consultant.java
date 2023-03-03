package com.aurionpro.model;

public class Consultant implements IRole {

	@Override
	public String description() {
		return "I am Consultant.";
	}

	@Override
	public String responsibility() {
		return "I do consultant duty.";
	}

}
