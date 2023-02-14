package com.aurionpro.test;

import java.util.Scanner;

public class ValidateAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		validateUserAge(age);
	}

	private static void validateUserAge(int age) {
		if(age>18) {
			System.out.println("Eligible for Voting.");
		}
		else {
			throw new RuntimeException("Under Age.");
		}
	}

}
