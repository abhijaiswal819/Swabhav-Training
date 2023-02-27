package com.aurionpro.model;

public class MahindraFactory implements ICarFactory {

	@Override
	public ICars makeCar() {
		return new Mahindra();
	}

}
