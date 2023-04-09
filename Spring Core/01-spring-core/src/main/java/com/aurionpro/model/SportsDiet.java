package com.aurionpro.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SportsDiet implements IDiet{

	@Override
	public String getDietPlan() {
		return "take proteins, and reduce fats..";
	}

}
