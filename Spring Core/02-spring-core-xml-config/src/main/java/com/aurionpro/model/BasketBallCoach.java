package com.aurionpro.model;

public class BasketBallCoach implements ICoach{

	private IDiet diet;
	public BasketBallCoach(IDiet diet) {
		super();
		this.diet = diet;
	}

	@Override
	public String getTrainingDetails() {
		return "Start workout";
	}

	@Override
	public String getDietPlan() {
		return diet.getDietPlan();
	}

}
