package com.aurionpro.model;

public class Triangle extends Shape{

	public Triangle(IColor c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	} 
}
