package com.aurionpro.model;

public class ReflectionTest {

	public static void main(String[] args) {
		try {
			Reflection.getDetail(Class.forName(args[0]));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
