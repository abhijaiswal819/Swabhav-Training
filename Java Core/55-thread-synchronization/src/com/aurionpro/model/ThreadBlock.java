package com.aurionpro.model;

public class ThreadBlock implements Runnable {

	PrintBlockSynch numbers;

	public ThreadBlock(PrintBlockSynch numbers) {
		this.numbers = numbers;
	}

	@Override
	public void run() {
		numbers.printDetails();
	}
}
