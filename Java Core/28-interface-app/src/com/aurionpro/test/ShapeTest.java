package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle small = new Rectangle(5,10);
		System.out.println(small);
		System.out.println("Area is "+small.calculateArea());
		small.showColor();
	}

}
