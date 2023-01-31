package com.aurionpro.test;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(20, 60, ColorType.BLUE);
		display(rectangle);	
		System.out.println();
		
		Rectangle rectangle1 = new Rectangle(20, 40);
		display(rectangle1);
		System.out.println();
		
		Rectangle rectangle2 = new Rectangle();
		display(rectangle2);
		
		
	}

	private static void display(Rectangle obj)

	{

		System.out.println(" Width of  Rectangle: " + obj.getWidth());
		System.out.println(" Heigth of  Rectangle: " + obj.getHeight());
		System.out.println(" Color of  Rectangle: " + obj.getColor());
		System.out.println(" Area of  Rectangle: " + obj.calculateArea());

	}


}
