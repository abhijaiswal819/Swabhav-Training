package com.aurionpro.model;

public class Circle extends Shape {
	
	private double radius;

	public Circle(color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
