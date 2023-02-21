package com.aurionpro.model;

public class AddIntergers implements IAddable, IGreetable {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void greet(String name) {
		//System.out.println("Welcome "+name);
	}

}
