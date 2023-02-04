package com.aurionpro.model;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Please enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int j=1;j<=num;j++) {
			fact=fact*j;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}
}
