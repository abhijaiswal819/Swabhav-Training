package com.aurionpro.model;

public class Circle {
	
	private double radius;
	/**
	 * @param radius
	 * @param border
	 */
	public Circle(double radius, BorderType border) {
		super();
		this.radius = radius;
		this.border = border;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public BorderType getBorder() {
		return border;
	}
	public void setBorder(BorderType border) {
		this.border = border;
	}
	private BorderType border;
	
	public double calculateArea() {
		double area;
		area=3.14*radius*radius;
		return area;
	}
	
}
