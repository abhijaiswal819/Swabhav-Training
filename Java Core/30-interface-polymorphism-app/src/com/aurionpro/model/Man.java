package com.aurionpro.model;

public class Man implements IEmotionable, IMannerable {

	@Override
	public void greetOnArrival() {
		System.out.println("Man greet on arrival.");
	}

	@Override
	public void greetOnDeparture() {
		System.out.println("Man greet on departure.");		
	}

	@Override
	public void laugh() {
		System.out.println("Man laughs.");		
	}

	@Override
	public void cry() {
		System.out.println("Man cries.");		
	}

	
}
