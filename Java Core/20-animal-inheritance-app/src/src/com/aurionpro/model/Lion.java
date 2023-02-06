package src.com.aurionpro.model;

public class Lion extends Animal {

	public Lion(String animalType, boolean isCarnivorous) {
		super(animalType, isCarnivorous);
	}
	
	@Override
	public void eat() {
		System.out.println("Lion is eating.");
	}
}
