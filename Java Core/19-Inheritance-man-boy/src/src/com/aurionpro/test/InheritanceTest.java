package src.com.aurionpro.test;

import src.com.aurionpro.model.Boy;
import src.com.aurionpro.model.Kid;
import src.com.aurionpro.model.Man;

public class InheritanceTest {

	public static void main(String[] args) {
		//Parent parent = new Parent("Hello from Parent.");
		
		Case1();
		Case2();		
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
