package com.aurionpro.test;

public class StaticTest {

	public static void main(String[] args) {
		int localVariable = 10;
		printvar(localVariable);
	}

	private static void printvar(int var) {
		System.out.println(var);
	}

}
