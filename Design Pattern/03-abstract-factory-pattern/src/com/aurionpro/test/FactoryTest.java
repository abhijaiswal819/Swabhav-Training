package com.aurionpro.test;

import com.aurionpro.model.ICarFactory;
import com.aurionpro.model.ICars;
import com.aurionpro.model.MarutiFactory;
import com.aurionpro.model.TataFactory;

public class FactoryTest {

	public static void main(String[] args) {
		//ICarFactory marutiFactory = new MarutiFactory();
		ICarFactory marutiFactory = MarutiFactory.getInstance();
		ICars maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
		
		//ICarFactory tataFactory = new TataFactory();
		ICarFactory tataFactory = TataFactory.getInstance();
		ICars tata = tataFactory.makeCar();
		tata.start();
		tata.stop();
		
	}

}
