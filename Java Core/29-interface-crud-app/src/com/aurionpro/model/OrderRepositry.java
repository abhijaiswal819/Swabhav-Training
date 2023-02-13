package com.aurionpro.model;

public class OrderRepositry implements IRepositry {

	@Override
	public void create() {
		System.out.println("Order created.");
	}

	@Override
	public void update() {
		System.out.println("Order updated.");
	}

	@Override
	public void delete() {
		System.out.println("Order deleted.");
	}

	@Override
	public void read() {
		System.out.println("Order read.");
	}
}
