package com.aurionpro.model;

public class Robot implements IWorker {

	@Override
	public void start() {
		System.out.println("Robot is starting.");
	}

	@Override
	public void stop() {
		System.out.println("Robot stopped.");

	}

	@Override
	public void eat() {
		System.out.println("Robots don't eat.");

	}

	@Override
	public void rest() {
		System.out.println("Robots don't rest.");

	}

}
