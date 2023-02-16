package com.aurionpro.test;

public class Unchecked {

	public static void main(String[] args) {
		method();
		System.out.println("main");
	}

	private static void method() {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("method1");
	}

	private static void method1() {
		method2();
		System.out.println("method2");
	}

	private static void method2() {
		throw new RuntimeException("an exception occured..");	
	}

}
