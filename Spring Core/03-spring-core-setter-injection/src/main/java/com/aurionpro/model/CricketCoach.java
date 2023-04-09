package com.aurionpro.model;

public class CricketCoach implements ICoach {

	private IDiet diet;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;
	
	public CricketCoach() {
		System.out.println("Cricket: Goto home done for today");
	}

	public IDiet getDiet() {
		return diet;
	}

	public void setDiet(IDiet diet) {
		this.diet = diet;
		System.out.println("Inside Cricket setter");
	}

	@Override
	public String getTrainingDetails() {
		System.out.println("Coach name: "+getName());
		System.out.println("Coach email: "+getEmail());
//		System.out.println(name);
//		System.out.println(email);
		return "Cricket: You can sleep now";
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public void initCricketStuff() {
		System.out.println("Inside init Cricket stuff");
	}
	
	public void destroyCricketStuff() {
		System.out.println("Inside destroy Cricket stuff");
	}

//	@Override
//	public String getDietPlan() {
//		return diet.getDietPlan();
//	}

}
