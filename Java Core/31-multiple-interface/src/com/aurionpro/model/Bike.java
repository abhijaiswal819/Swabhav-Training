package com.aurionpro.model;

public class Bike extends Vehicle implements IMovable {

	public Bike(String name) {
		super(name);
		System.out.println("Bike's name is "+name);
	}

	@Override
	public void move() {
		System.out.println(getName()+" is moving.");
	}

}
