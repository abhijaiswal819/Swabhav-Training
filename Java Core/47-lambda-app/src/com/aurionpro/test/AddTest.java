package com.aurionpro.test;

import com.aurionpro.model.AddIntergers;
import com.aurionpro.model.IAddable;
import com.aurionpro.model.IGreetable;

public class AddTest {

	public static void main(String[] args) {
		// IAddable addObj = new AddIntergers();
		// System.out.println(addObj.add(10, 20));

		/////////// anonymous class
//		IAddable addObj2 =new IAddable() {
//			
//			@Override
//			public int add(int a, int b) {
//				return a+b;
//			}
//		};
//		System.out.println(addObj2.add(20, 30));

		////////// Lambda funtion
		// 1
//		IAddable addObj3 = (int a, int b) -> {
//			return a + b;
//		};
//		System.out.println(addObj3.add(20, 30));

		// 2
//		IAddable addObj3 = (a, b) -> {
//			return a + b;
//		};
//		System.out.println(addObj3.add(20, 30));

		// 3
//		IAddable addObj3 = (a, b) -> a + b;
//		System.out.println(addObj3.add(20, 30));
//
//		IGreetable addObj4 = (name) -> System.out.println("Good evening " + name);
//		addObj4.greet("Abhishek");

		// 4-Method Reference
		IAddable addObj = AddTest::numberAddition;
		System.out.println(addObj.add(20, 30));

		IGreetable addObj2 = (name) -> System.out.println("Good evening " + name);
		addObj2.greet("Abhishek");

		IGreetable addObj3 = AddTest::welcome;
		addObj3.greet("Abhishek");

		AddTest test = new AddTest();
		IGreetable addObj4 = test::helloAll;
		addObj4.greet("Abhishek");
	}

	public static int numberAddition(int a, int b) {
		return a + b;
	}

	public static void welcome(String name) {
		System.out.println("Welcome "+ name);
	}
	
	public void helloAll(String name) {
		System.out.println("Welcome "+ name);
	}
}
