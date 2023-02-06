package src.com.aurionpro.test;

import src.com.aurionpro.model.Animal;
import src.com.aurionpro.model.Cow;
import src.com.aurionpro.model.Lion;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal("Wild Animal",true);
		System.out.println(animal);
		animal.eat();
		
		Cow cow = new Cow("Domestic",false); 
		System.out.println(cow);
		cow.eat();
		
		Lion lion = new Lion("Wild Animal",true); 
		System.out.println(lion);
		lion.eat();
	}
}
