package com.aurionpro.test;

import com.aurionpro.model.CarFactory;
import com.aurionpro.model.CarType;
import com.aurionpro.model.ICars;

public class FactoryTest {

	public static void main(String[] args) {
		CarFactory obj = new CarFactory();
		ICars tata = obj.makeCars(CarType.Tata);
		tata.start();
		tata.stop();
		
		ICars maruti = obj.makeCars(CarType.Maruti);
		maruti.start();
		maruti.stop();
	}

}
