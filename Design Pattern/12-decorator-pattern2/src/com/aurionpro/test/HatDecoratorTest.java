package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.IHat;
import com.aurionpro.model.PremiumHat;
import com.aurionpro.model.RibonelHat;
import com.aurionpro.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		IHat sh = new StandardHat();
		GoldenHat gh = new GoldenHat(sh);
		RibonelHat rh = new RibonelHat(gh);
		System.out.println(rh.getName());
		System.out.println(rh.getPrice());
		System.out.println(rh.getDescription());
	}

}
