package com.aurionpro.test;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		printCircleDetails(circle);
		
		System.out.println();
		Circle circle1 = new Circle(6.5, BorderType.Solid);
		printCircleDetails(circle1);	

	}

	private static void printCircleDetails(Circle obj) {
		System.out.println("Radius of the Circle is "+obj.getRadius());
		System.out.println("Border Type of the Circle is "+obj.getBorder());
		System.out.println("Area of circle with radius "+obj.getRadius()+ " is "+obj.calculateArea());
	}

}
