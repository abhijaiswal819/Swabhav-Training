package com.aurionpro.model;

import java.util.Scanner;

public class Ride {

	public static void main(String[] args) {
		int cost=0;
		System.out.println("Welcome to Ride Island.");
		Scanner st = new Scanner(System.in);
		System.out.println("Please enter your height in cm.");
		int height = st.nextInt();
		if (height > 120) {
			System.out.println("Congrats, you can ride.");
			System.out.println("Please enter your age.");
			int age = st.nextInt();
			if (age<12) {
				cost=cost+5;
			}
			else if(age>=12 && age<18) {
				cost=cost+7;
			}
			else if(age>=18 && age<45) {
				cost=cost+12;
			}
			else if(age>=45 && age<55) {
				cost=cost+3;
			}
			
			System.out.println("Do you want photos?");
			String photo = st.next();
			if(photo.equalsIgnoreCase("Yes")) {
				cost=cost+3;
			}
			System.out.println("The total bill is "+ cost);
		}
		else {
			System.out.println("Sorry, you can't ride.");
		}
	}

}
