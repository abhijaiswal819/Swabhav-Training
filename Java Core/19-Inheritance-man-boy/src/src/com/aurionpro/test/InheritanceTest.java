package src.com.aurionpro.test;

import src.com.aurionpro.model.Boy;
import src.com.aurionpro.model.Infant;
import src.com.aurionpro.model.Kid;
import src.com.aurionpro.model.Man;

public class InheritanceTest {

	public static void main(String[] args) {
		//Parent parent = new Parent("Hello from Parent.");
		
		//Case1();
		//Case2();	
		//Case3();
		Case4();
	}

	private static void Case4() {
		//Autoboxing-it converts primitive type to wrapper class
		Object x;
		
		x=100;
		System.out.println(x.getClass());
		x="Hello";
		System.out.println(x.getClass());
	}

	private static void Case3() {
		atThePark(new Man());
		atThePark(new Kid());
		atThePark(new Boy());
		atThePark(new Infant());
	}

	private static void atThePark(Man man) {
		man.play();
	}

	private static void Case2() {
		Man man = new Boy();
		man.play();
		man.eat();
	}

	private static void Case1() {
		Boy child = new Boy(); 
		child.read();
		child.play();
		child.eat();
		
		Kid kid = new Kid();
		kid.play();
		kid.eat();
	}
}
