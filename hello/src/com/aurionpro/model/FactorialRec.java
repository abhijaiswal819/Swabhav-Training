package com.aurionpro.model;

import java.util.Scanner;

public class FactorialRec {

	public static void main(String[] args) {
		System.out.println("Please enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int output=fact(num);
		System.out.println("Factorial of "+num+" is: "+output);
	}

	private static int fact(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}
}
