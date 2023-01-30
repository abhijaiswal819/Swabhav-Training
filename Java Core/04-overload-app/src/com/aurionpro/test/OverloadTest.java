package com.aurionpro.test;

import java.util.Scanner;

public class OverloadTest {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		float p=10.1f;
		float q=20.1f;
		float r=30.1f;
		double x=10.1;
		double y=20.1;
		double z=30.1;
		addition(a,b);
		addition(p,q);
		addition(x,y);
		addition(c,r);
		addition(c,z);
		addition(r,z);
	}

	private static void addition(double x, double y) {
		System.out.println(x+y);
		
	}

	private static void addition(float p, float q) {
		System.out.println(p+q);
		
	}

	private static void addition(int a, int b) {
		System.out.println(a+b);
		
	}

}
