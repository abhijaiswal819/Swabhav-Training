package com.aurionpro.model;

import java.util.Scanner;

public class Treasure {
	public static void main(String[] args) {
		System.out.println("Welcome to Treasure Island. Your mission is to find the treasure.");
		Scanner st = new Scanner(System.in);
		System.out.println("Want to go Left or Right?");
		String val = st.nextLine();
		if (val.equalsIgnoreCase("Right")) {
			System.out.println("Fall into a hole Game Over.");
		} else if (val.equalsIgnoreCase("Left")) {
			System.out.println("Want to Swim or Wait?");
			val = st.nextLine();
			if (val.equalsIgnoreCase("Swim")) {
				System.out.println("Attacked by trout Game Over.");
			} else if (val.equalsIgnoreCase("Wait")) {
				System.out.println("Which door you want to select Red, Blue or Yellow");
				val = st.nextLine();
				if (val.equalsIgnoreCase("Red")) {
					System.out.println("Burned by fire Game Over.");
				} else if (val.equalsIgnoreCase("Blue")) {
					System.out.println("Eaten by beasts Game Over.");
				} else if (val.equalsIgnoreCase("Yellow")) {
					System.out.println("You Win!");
				} else {
					System.out.println("Game Over.");
				}
			} else {
				System.out.println("Attacked by trout Game Over.");
			}
		} else {
			System.out.println("Fall into a hole Game Over.");
		}
	}
}
