package com.aurionpro.model;

public class TataFactory implements ICarFactory {

	static TataFactory instance;

	private TataFactory() {
	}
	
	public static TataFactory getInstance() {
		if (instance == null) {
			instance = new TataFactory();
		}
		return instance;
	}
	
	@Override
	public ICars makeCar() {
		return new Tata();
	}

}
