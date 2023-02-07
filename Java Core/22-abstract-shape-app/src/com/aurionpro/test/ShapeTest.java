package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.color;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(color.blue, 3.5);
		System.out.println(circle.getColor());
		System.out.println("Area of Circle is " + circle.calculateArea());

		Rectangle rectangle = new Rectangle(color.green, 3.5, 4.5);
		System.out.println(rectangle.getColor());
		System.out.println("Area of Circle is " + rectangle.calculateArea());
	}

}
