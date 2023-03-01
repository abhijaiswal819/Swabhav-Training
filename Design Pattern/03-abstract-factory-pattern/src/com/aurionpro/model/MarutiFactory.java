package com.aurionpro.model;

public class MarutiFactory implements ICarFactory {
	
	static MarutiFactory instance;

	private MarutiFactory() {
	}
	
	public static MarutiFactory getInstance() {
		if (instance == null) {
			instance = new MarutiFactory();
		}
		return instance;
	}

	@Override
	public ICars makeCar() {
		return new Maruti();
	}

}
