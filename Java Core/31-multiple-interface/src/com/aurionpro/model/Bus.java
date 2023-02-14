package com.aurionpro.model;

public class Bus extends Vehicle implements IMovable {

	public Bus(String name) {
		super(name);
		System.out.println("Bus's name is "+name);
	}

	@Override
	public void move() {
		System.out.println(getName()+" is moving.");
	}

}
