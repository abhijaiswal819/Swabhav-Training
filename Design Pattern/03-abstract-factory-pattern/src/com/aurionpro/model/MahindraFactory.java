package com.aurionpro.model;

public class MahindraFactory implements ICarFactory {

	static MahindraFactory instance;

	private MahindraFactory() {
	}
	
	public static MahindraFactory getInstance() {
		if (instance == null) {
			instance = new MahindraFactory();
		}
		return instance;
	}
	
	@Override
	public ICars makeCar() {
		return new Mahindra();
	}

}
