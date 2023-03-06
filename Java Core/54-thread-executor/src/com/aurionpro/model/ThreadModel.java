package com.aurionpro.model;

public class ThreadModel extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Task -> " + this.getName());

		}
		System.out.println();
	}
}
