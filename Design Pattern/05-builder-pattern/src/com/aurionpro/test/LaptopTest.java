package com.aurionpro.test;

import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {

		LaptopBuilder builder = new LaptopBuilder();
		Laptop laptop = builder.addRam("Unknown")
				.addHdd("Samsung")
				.addMouse("Logitech")
				.addKeyboard("iBall")
				.addTouchScreen(true)
				.buildLaptop();
		
		System.out.println(laptop);	
	}
}
