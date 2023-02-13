package com.aurionpro.model;

public class ProductRepositry implements IRepositry {

	@Override
	public void create() {
		System.out.println("Product created.");
	}

	@Override
	public void update() {
		System.out.println("Product updated.");
	}

	@Override
	public void delete() {
		System.out.println("Product deleted.");
	}

	@Override
	public void read() {
		System.out.println("Product read.");
	}
}
