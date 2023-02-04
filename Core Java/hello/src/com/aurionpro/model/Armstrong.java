package com.aurionpro.model;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Please enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnum = num;

		int count = 0;
		while (cnum > 0) {
			cnum = cnum / 10;
			count++;
		}

		cnum = num;
		int sum = 0;
		while (cnum != 0) {
			int numDigit = cnum % 10;
			sum = (int) (sum + Math.pow(numDigit, count));
			cnum = cnum / 10;
		}
		if (sum == num)
			System.out.println(num + " is an Armstrong Number.");
		else
			System.out.println(num + " is not an Armstrong Number.");
	}

}
