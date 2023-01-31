package com.aurionpro.model;
public class Rectangle {

	private double width;

	private double height;
	private ColorType color;

	public Rectangle(float width, float height, ColorType color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public Rectangle(float width, float height) {
		this(width, height, ColorType.RED);
	}

	public Rectangle() {
		this(10, 5, ColorType.RED);

	}

	public ColorType getColor() {
		return color;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double calculateArea() {

		return (width * height);
	}

}