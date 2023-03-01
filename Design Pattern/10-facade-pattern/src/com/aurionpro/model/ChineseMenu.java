package com.aurionpro.model;

public class ChineseMenu implements IMenu {

	@Override
	public void displayMenu() {
		System.out.println("-> List of Chinese dishes: <-");
		System.out.println("Chow Mein");
		System.out.println("Hot Pot");
		System.out.println("Dumplings");
		System.out.println("Kung Pao Chicken");
		System.out.println("Ma Po Tofu");
		System.out.println("Peking duck");
		System.out.println("Wonton Soup");
		System.out.println("Scallion Pancakes");
		System.out.println();
	}

}
