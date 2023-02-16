package com.aurionpro.test;

import java.util.Scanner;

public class ValidateAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try {
			validateUserAge(age);
			System.out.println("hi");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			//System.out.println(e.toString());
			//System.out.println(e);
		}
	}

	//private static void validateUserAge(int age) {
	private static void validateUserAge(int age) throws InvalidAgeException{
		if(age>18) {
			System.out.println("Eligible for Voting.");
		}
		else {
			throw new InvalidAgeException("Under Age.");
		}
	}

}
