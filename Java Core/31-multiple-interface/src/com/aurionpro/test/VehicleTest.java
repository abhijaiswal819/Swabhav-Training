package com.aurionpro.test;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;

public class VehicleTest {

	public static void main(String[] args) {
		IMovable[] movables = { new Car("Maruti"), new Bus("Tata"), new Bike("Bajaj") };
		startMoving(movables);
	}

	private static void startMoving(IMovable[] movables) {
		for (IMovable x : movables) {
			System.out.println();
			x.move();
		}
	}

}
