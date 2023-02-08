package com.aurionpro.model;

import java.util.Scanner;

public class PlayPig {
	
	public static void main(String[] args) {
		System.out.println("Let's Play PIG!");
		System.out.println();
		System.out.println("* See how many turns it takes you to get to 20.\r\n"
				+ "* Turn ends when you hold or roll a 1.\r\n"
				+ "* If you roll a 1, you lose all points for the turn.\r\n"
				+ "* If you hold, you save all points for the turn\r");
		
		game();
	}
	private static void game() {
		Scanner sc = new Scanner(System.in);
		int turnscore = 0;
		int turn = 0;
		int points = 0;
		int die = 0;
		
		while (points < 20) {
			turn++;
			System.out.println("\nTURN " + turn);
			turnscore=0;
			die = 0;
			while (die != 1) {
				System.out.print("Roll or hold? (r/h): ");
				String choice = sc.next();
				if (choice.equals("r")) {
					die = (int) (Math.random() * 6) + 1;
					System.out.println("Die: " + die);
					turnscore = turnscore + die;
					
					if (die == 1) {
						System.out.println("Turn over. No score.");
						System.out.println("Total score : " + points);
					}
					else if((turnscore+points)>=20) {
						points = points + turnscore;
						System.out.println("Score for turn : " + turnscore);
						System.out.println("Total score : " + points);
						break;
					}
				} else if (choice.equals("h")) {
					points = points + turnscore;
					System.out.println("Score for turn : " + turnscore);
					System.out.println("Total score : " + points);
					break;
				}
				else {
					System.out.println("Enter a valid input.");
				}

			}
		}
		
		System.out.println();
		System.out.println("You finished in " + turn + " turns!");
		System.out.println();
		System.out.println("Game Over! ");
	}
}
