package com.aurionpro.model;

public class RibonelHat extends HatDecorator{

	public RibonelHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		return "Ribonel "+hat.getName();
	}

	@Override
	public int getPrice() {
		return 1000+ hat.getPrice();
	}

	@Override
	public String getDescription() {
		return hat.getDescription()+" in a Robenol";
	}
}
