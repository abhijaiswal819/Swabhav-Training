package com.aurionpro.model;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*System.out.println("Prime numbers between 1-100:");
		for(int i=1;i<=100;i++) {
			boolean isPrime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}*/
		System.out.println("Please enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int j=2;j<=num/2;j++) {
			if(num%j==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Entered number "+num+" is a Prime Number");
		}
		else {
			System.out.println("Entered number "+num+" is not a Prime Number");
		}
	}
}
