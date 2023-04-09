package com.aurionpro.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurionpro.model.CricketCoach;
import com.aurionpro.model.ICoach;

public class CoachTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/aurionpro/model/applicationContext.xml");
		ICoach cCoach = (ICoach) context.getBean("CricketCoach", ICoach.class);
		ICoach bCoach = (ICoach) context.getBean("BasketBallCoach", ICoach.class);
		System.out.println(cCoach.getTrainingDetails());
		System.out.println(cCoach.getDietPlan());
		System.out.println(bCoach.getTrainingDetails());
		System.out.println(bCoach.getDietPlan());
	}
}

