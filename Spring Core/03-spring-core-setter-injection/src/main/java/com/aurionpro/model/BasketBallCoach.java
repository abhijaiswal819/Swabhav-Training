package com.aurionpro.model;

public class BasketBallCoach implements ICoach {

	private IDiet diet;

	public BasketBallCoach() {
		System.out.println("Basketball: You can't go home now");
	}

	public IDiet getDiet() {
		return diet;
	}

	public void setDiet(IDiet diet) {
		this.diet = diet;
		System.out.println("Inside BasketBall setter");
	}

	@Override
	public String getTrainingDetails() {
		return "Basketball: Start workout";
	}

//	@Override
//	public String getDietPlan() {
//		return diet.getDietPlan();
//	}

}
