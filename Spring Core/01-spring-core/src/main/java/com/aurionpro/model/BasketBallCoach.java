package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasketBallCoach implements ICoach{

	private IDiet diet;
	
	public BasketBallCoach(@Qualifier(value="sportsDiet")IDiet diet) {
		super();
		this.diet = diet;
	}

	@Override
	public String getTrainingDetails() {
		return "Practice freethrows for 30 mins";
	}

	@Override
	public String getDietPlan() {
		return diet.getDietPlan();
	}

}
