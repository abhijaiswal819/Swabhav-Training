package com.aurionpro.model;

abstract public class Shape {

	private color Color;

	public color getColor() {
		return Color;
	}

	public Shape(color color) {
		super();
		Color = color;
	}

	abstract public double calculateArea();	
}
