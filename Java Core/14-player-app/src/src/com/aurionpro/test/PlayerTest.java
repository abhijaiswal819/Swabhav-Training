package src.com.aurionpro.test;


import src.com.aurionpro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {


		Player[] players= {
				new Player("RAM", 29, "INDIA"),
				new Player("SHYAM", 12, "USA"),
				new Player("RAJ", 34, "CHINA"),
				new Player("LAXMAN", 25, "UAE"),
				new Player("ROHIT", 17, "GERMANY")
		};
		
		for(Player x: players) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Elder is: ");
		System.out.println(players[0].getElderPlayer(players));
	}

}
