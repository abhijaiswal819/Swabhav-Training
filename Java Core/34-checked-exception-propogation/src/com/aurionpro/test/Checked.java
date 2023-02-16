package com.aurionpro.test;

public class Checked {

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

	private static void method1() throws Exception {
		method2();
		System.out.println("method2");
	}

	private static void method2() throws Exception {
		throw new Exception("an exception occured..");	
	}

}
