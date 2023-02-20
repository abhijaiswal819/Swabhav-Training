package com.aurionpro.test;

import com.aurionpro.model.AddIntergers;
import com.aurionpro.model.IAddable;

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
		IAddable addObj3 = (a, b) -> a + b;
		System.out.println(addObj3.add(20, 30));

	}

}
