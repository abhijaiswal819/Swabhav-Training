package com.aurionpro.model;

public class Rectangle extends Shape {

	private double height;
	private double width;

	public Rectangle(color color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return height * width;
	}
}
