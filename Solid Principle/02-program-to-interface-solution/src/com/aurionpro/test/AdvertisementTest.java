package com.aurionpro.test;

import com.aurionpro.model.Advertisement;
import com.aurionpro.model.Billboard;
import com.aurionpro.model.Projector;

public class AdvertisementTest {

	public static void main(String[] args) {

		Advertisement advObj1 = new Advertisement("Selling a bike..", new Billboard());
		advObj1.showAdvertisement();
		
		Advertisement advObj2 = new Advertisement("Selling a bike..", new Projector());
		advObj2.showAdvertisement();
		
	}

}
