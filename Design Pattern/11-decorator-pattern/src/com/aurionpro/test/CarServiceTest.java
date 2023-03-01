package com.aurionpro.test;

import com.aurionpro.model.CarInspection;
import com.aurionpro.model.ICarService;
import com.aurionpro.model.OilChange;
import com.aurionpro.model.WheelAlign;

public class CarServiceTest {

	public static void main(String[] args) {
		ICarService car = new CarInspection();
		OilChange carOil = new OilChange(car);
		WheelAlign carWheel = new WheelAlign(carOil);
		System.out.println("Total Service cost is : "+carWheel.getCost());
	}

}
