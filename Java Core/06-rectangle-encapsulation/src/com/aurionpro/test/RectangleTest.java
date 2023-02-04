package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		//System.out.println(rectangle.length);
		//System.out.println(rectangle.width);
		rectangle.setLength(99);
		rectangle.setWidth(5);
		rectangle.setColor("blue");
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getColor());
		
		Rectangle rectangle2 = new Rectangle();
		//System.out.println(rectangle.length);
		//System.out.println(rectangle.width);
		rectangle2.setLength(98);
		rectangle2.setWidth(5);
		rectangle2.setColor("blue");
		System.out.println(rectangle2.getLength());
		System.out.println(rectangle2.getWidth());
		System.out.println(rectangle2.getColor());		
		System.out.println(rectangle == rectangle2);
		System.out.println(rectangle.equals(rectangle2));
		/*Rectangle rectangle2 = new Rectangle();
		System.out.println(rectangle2.length);
		System.out.println(rectangle2.width);
		rectangle2.length=15;
		rectangle2.width=10;
		System.out.println(rectangle2.length);
		System.out.println(rectangle2.width);
		*/
	}

}
