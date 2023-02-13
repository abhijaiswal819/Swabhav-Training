package com.aurionpro.model;

public class BMI {

	private Person person;
	private double bmi;

	public double getBmi() {
		return bmi;
	}

	public BMI(Person person) {
		super();
		this.person = person;
		this.bmi = calculateBMI();
	}

	public double calculateBMI() {
		// bmi = person.getWeight() / (person.getHeight()*person.getHeight());
		// System.out.println(person.getName()+"'s BMI is " + bmi);
		return person.getWeight() / (person.getHeight() * person.getHeight());
	}

	public String getBodyType() {
		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			return "Healthy Weight";
		} else if (bmi >= 25 && bmi < 30) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}

}
