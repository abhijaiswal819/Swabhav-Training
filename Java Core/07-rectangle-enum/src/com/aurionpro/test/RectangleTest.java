package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.color;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		//System.out.println(rectangle.length);
		//System.out.println(rectangle.width);
		rectangle.setLength(101);
		rectangle.setWidth(5);
		rectangle.setColor(color.blue);
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getColor());
		
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
