package com.aurionpro.model;

public class ItalianMenu implements IMenu {

	@Override
	public void displayMenu() {
		System.out.println("-> List of Italian dishes: <-");
		System.out.println("Risotto Alla Milanese");
		System.out.println("Polenta");
		System.out.println("Lasagna");
		System.out.println("Ravioli");
		System.out.println("Osso buco");
		System.out.println("Arancini");
		System.out.println("Ribollita");
		System.out.println("Spaghetti Alla Carbonara");
		System.out.println();
	}

}
