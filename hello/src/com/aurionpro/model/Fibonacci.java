package com.aurionpro.model;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Please enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int first=0,second=1;
		int sum=0;
		/*if(num==0) {
			System.out.print("Invalid Number(must be >0)");
		}
		else if(num==1) {
			System.out.print("The first " + num + " Fibonacci series are: ");
			System.out.print(first);
		}
		else {
			System.out.print("The first " + num + " Fibonacci series are: ");
			System.out.print(first + " " + second);
			for(int j=2;j<num;j++) {
				sum=first+second;
				first=second;
				second=sum;
				System.out.print(" " + sum);
			}
		}*/
		System.out.print("The first " + num + " Fibonacci series are: ");
		for(int j=0;j<num;j++) {
			System.out.print(first + " ");
			sum=first+second;
			first=second;
			second=sum;
			//System.out.print(" " + sum);
		}
	}
}
