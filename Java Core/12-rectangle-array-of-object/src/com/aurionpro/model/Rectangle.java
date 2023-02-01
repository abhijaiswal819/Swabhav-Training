package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;

	/**
	 * @param height
	 * @param width
	 */
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double calArea(double height, double width) {
		return height*width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", Area="+calArea(height,width) +"]";
	};

	
}
