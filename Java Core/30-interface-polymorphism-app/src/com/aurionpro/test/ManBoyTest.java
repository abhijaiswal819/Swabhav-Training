package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();

		atTheMovies(man);
		// atTheMovies(boy);

		atTheParty(man);
		atTheParty(boy);
	}

	private static void atTheMovies(IEmotionable obj) {
		obj.laugh();
		obj.cry();
		System.out.println();
	}

	private static void atTheParty(IMannerable obj) {
		obj.greetOnArrival();
		obj.greetOnDeparture();
		System.out.println();
	}

}
