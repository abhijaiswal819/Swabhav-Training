package com.aurionpro.model;

public class CustomerRepositry implements IRepositry {

	@Override
	public void create() {
		System.out.println("Customer created.");
	}

	@Override
	public void update() {
		System.out.println("Customer updated.");
	}

	@Override
	public void delete() {
		System.out.println("Customer deleted.");
	}

	@Override
	public void read() {
		System.out.println("Customer read.");
	}
}
