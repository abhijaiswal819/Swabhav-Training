package com.aurionpro.model;

public class TechLead implements IRole {

	@Override
	public String description() {
		return "I am Tech Lead.";
	}

	@Override
	public String responsibility() {
		return "I do tech lead duty.";
	}
}
