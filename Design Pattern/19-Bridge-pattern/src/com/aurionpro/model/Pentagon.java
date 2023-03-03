package com.aurionpro.model;

public class Pentagon extends Shape{

	public Pentagon(IColor c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	} 

}
