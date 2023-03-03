package com.aurionpro.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		return "Golden "+hat.getName();
	}

	@Override
	public int getPrice() {
		return 500+ hat.getPrice();
	}

	@Override
	public String getDescription() {
		return hat.getDescription()+" in a Golden Shades";
	}
}
