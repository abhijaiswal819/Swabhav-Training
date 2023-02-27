package com.aurionpro.model;

public class MarutiFactory implements ICarFactory {

	@Override
	public ICars makeCar() {
		return new Maruti();
	}

}
