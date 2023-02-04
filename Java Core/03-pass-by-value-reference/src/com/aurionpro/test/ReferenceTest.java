package com.aurionpro.test;

import com.aurionpro.model.Circle;

public class ReferenceTest {

	public static void main(String[] args) {
		Circle circle =new Circle();
		circle.radius=10;
		converRadiusToZeroByValue(circle.radius);
		System.out.println(circle.radius);
		converRadiusToZeroByReference(circle);
		System.out.println(circle.radius);		
	}

	private static void converRadiusToZeroByValue(double radius) {
		radius=0;
		
	}

	private static void converRadiusToZeroByReference(Circle cir) {
		cir.radius=0;		
	}
}
