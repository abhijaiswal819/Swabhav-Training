package com.aurionpro.model;

public class ThreadModel implements Runnable {

	@Override
	public void run() {
		System.out.println("Thead is created.");
	}
}
