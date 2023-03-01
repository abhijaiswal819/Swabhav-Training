package com.aurionpro.model;

public class IndianMenu implements IMenu {

	@Override
	public void displayMenu() {
		System.out.println("-> List of Indian dishes: <-");
		System.out.println("Chicken Tikka Masala");
		System.out.println("Murg Makhni");
		System.out.println("Tandoori Chicken");
		System.out.println("Biryani");
		System.out.println("Daal Makhni");
		System.out.println("Samosa");
		System.out.println("Chaat");
		System.out.println("Pani Puri");
		System.out.println();
	}

}
