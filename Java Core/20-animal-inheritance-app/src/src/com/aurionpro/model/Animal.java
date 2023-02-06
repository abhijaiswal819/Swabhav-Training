package src.com.aurionpro.model;

public class Animal {

	private String animalType;
	public boolean isCarnivorous;
	
	
	public Animal(String animalType, boolean isCarnivorous) {
		this.animalType=animalType;
		this.isCarnivorous=isCarnivorous;
		//System.out.println("This is Parent Constructor. ");
	}

	public boolean isCarnivorous() {
		return isCarnivorous;
	}

	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	public void eat() {
		System.out.println("This is Parent's animal is eating.");
	}

	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", isCarnivorous=" + isCarnivorous + "]";
	}
	
	
	

}