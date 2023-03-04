package com.aurionpro.model;

public class ThreadModel implements Runnable {

	SampleNumber numbers;

	public ThreadModel(SampleNumber numbers) {
		this.numbers = numbers;
	}

	@Override
	public void run() {
		numbers.printDetails();
	}
}
