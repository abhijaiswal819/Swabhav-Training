package src.com.aurionpro.model;

public class Cow extends Animal {

	public Cow(String animalType, boolean isCarnivorous) {
		super(animalType, isCarnivorous);
	}
	
	@Override
	public void eat() {
		System.out.println("Cow is eating.");
	}
}
