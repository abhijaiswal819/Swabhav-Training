package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
//		Rectangle[] rectangles=new Rectangle[5];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			int height = getHeight(sc);
//			int width = getWidth(sc);
//			rectangles[i] =new Rectangle(height,width);
//		}
		
		Rectangle[] rectangles= {
				new Rectangle(10,20),
				new Rectangle(20,30),
				new Rectangle(30,40),
				new Rectangle(40,50),
				new Rectangle(50,60)
		};
		
		
		for(Rectangle x: rectangles) {
			System.out.println(x);
			//printDetails(x);
		}
	}

//	private static void printDetails(Rectangle x) {
//		System.out.println("Height: "+x.getHeight());
//		System.out.println("Width: "+x.getWidth());
//		System.out.println("Area: "+x.calArea(x.getHeight(), x.getWidth()));
//		System.out.println("---------------------------------");
//	}
//
//	private static int getWidth(Scanner sc) {
//		System.out.println("Enter Width: ");
//		int width=sc.nextInt();
//		return width;
//	}
//
//	private static int getHeight(Scanner sc) {
//		System.out.println("Enter Height: ");
//		int height=sc.nextInt();
//		return height;
//	}

}
