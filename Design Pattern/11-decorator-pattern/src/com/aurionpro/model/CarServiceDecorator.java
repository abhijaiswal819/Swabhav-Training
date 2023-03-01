package com.aurionpro.model;

public abstract class CarServiceDecorator implements ICarService{

	ICarService carObj;

	public CarServiceDecorator(ICarService carObj) {
		super();
		this.carObj = carObj;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return carObj.getCost();
	}
	
}
