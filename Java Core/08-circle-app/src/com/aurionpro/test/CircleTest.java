package com.aurionpro.test;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle(5.6, BorderType.Solid);
		//circle.setRadius(5.5);;
		//circle.setBorder(BorderType.Solid);;
		System.out.println("Radius of the Circle is "+circle.getRadius());
		System.out.println("Border Type of the Circle is "+circle.getBorder());
		System.out.println("Area of circle with radius "+circle.getRadius()+ " is "+circle.calculateArea());		
	}

}
