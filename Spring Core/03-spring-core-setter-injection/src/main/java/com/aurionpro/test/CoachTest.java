package com.aurionpro.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurionpro.model.CricketCoach;
import com.aurionpro.model.ICoach;

public class CoachTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/aurionpro/model/applicationContext.xml");
		CricketCoach cCoach = (CricketCoach) context.getBean("CricketCoach", CricketCoach.class);
		System.out.println(cCoach.getTrainingDetails());
		context.close();
//		System.out.println("Coach name: "+cCoach);
//		System.out.println("Coach email: "+cCoach);
//		System.out.println(cCoach.getDietPlan());
		
//		ICoach c2Coach = (ICoach) context.getBean("CricketCoach", ICoach.class);
//		System.out.println(cCoach==c2Coach);
		//true this means that every containers creates only one bean of a class
		//default behaviour is Singleton
		
		//if we add scope=prototype then we will get false
		//means for every getbean we will get different beans everytime
//		System.out.println(cCoach.hashCode());
//		System.out.println(c2Coach.hashCode());

		
//		ICoach bCoach = (ICoach) context.getBean("BasketBallCoach", ICoach.class);
//		System.out.println(bCoach.getTrainingDetails());
//		System.out.println(bCoach.getDietPlan());
	}
}

