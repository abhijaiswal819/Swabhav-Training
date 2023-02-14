package com.aurionpro.model;

public class Car extends Vehicle implements IMovable {

	public Car(String name) {
		super(name);
		System.out.println("Car's name is "+name);
	}

	@Override
	public void move() {
		System.out.println(getName()+" is moving.");
	}

}
