package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.length);
		System.out.println(rectangle.width);
		rectangle.length=10;
		rectangle.width=5;
		System.out.println(rectangle.length);
		System.out.println(rectangle.width);
		
		Rectangle rectangle2 = new Rectangle();
		System.out.println(rectangle2.length);
		System.out.println(rectangle2.width);
		rectangle2.length=15;
		rectangle2.width=10;
		System.out.println(rectangle2.length);
		System.out.println(rectangle2.width);
	}

}
