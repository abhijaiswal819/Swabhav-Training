package com.aurionpro.test;

import com.aurionpro.model.GreenColor;
import com.aurionpro.model.Pentagon;
import com.aurionpro.model.RedColor;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Triangle;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
