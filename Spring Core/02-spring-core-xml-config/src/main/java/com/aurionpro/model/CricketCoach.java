package com.aurionpro.model;

public class CricketCoach implements ICoach{

	private IDiet diet;
	public CricketCoach(IDiet diet) {
		super();
		this.diet = diet;
	}

	@Override
	public String getTrainingDetails() {
		return "You can sleep now";
	}

	@Override
	public String getDietPlan() {
		return diet.getDietPlan();
	}

}
