package com.aurionpro.test;

import com.aurionpro.model.BMI;
import com.aurionpro.model.Person;

public class BMITest {

	public static void main(String[] args) {
		System.out.println("Welcome to BMI Calculator.\n");
		Person person = new Person("RAM", 30, 1.78, 75);
		System.out.println(person+"\n");
		BMI bmi = new BMI(person);
		
		System.out.println(person.getName()+"'s BMI is " + bmi.getBmi()+".");
		System.out.println(person.getName()+"'s body type is " + bmi.getBodyType()+".");
	}
}
