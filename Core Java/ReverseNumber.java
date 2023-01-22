package com.aurionpro.model;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Please enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int revNum = 0;
	    
	    System.out.println("Before Reversed " + num);
	    while(num != 0) {
	      int numDigit = num % 10;
	      revNum = revNum * 10 + numDigit;
	      num /= 10;
	    }
	    System.out.println("After Reversed: " + revNum);
	}

}
