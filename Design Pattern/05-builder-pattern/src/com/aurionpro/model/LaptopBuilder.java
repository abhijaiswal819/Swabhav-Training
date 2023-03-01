package com.aurionpro.model;

public class LaptopBuilder {

	private Laptop laptop;

	public LaptopBuilder() {
		this.laptop = new Laptop();
	}
	
	public LaptopBuilder addRam(String ram) {
		laptop.setRam(ram);
		return this;
	}
	
	public LaptopBuilder addHdd(String hdd) {
		laptop.setHdd(hdd);
		return this;
	}
	
	public LaptopBuilder addKeyboard(String keyboard) {
		laptop.setKeyboard(keyboard);
		return this;
	}
	
	public LaptopBuilder addMouse(String mouse) {
		laptop.setMouse(mouse);
		return this;
	}
	
	public LaptopBuilder addTouchScreen(boolean touchScreen) {
		laptop.setTouchScreen(touchScreen);
		return this;
	}
	
	public Laptop buildLaptop() {
		return laptop;
	}
}
