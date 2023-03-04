package com.aurionpro.model;

public class PrintBlockSynch {

	public void printDetails() {
		synchronized (this) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(Thread.currentThread().getName() + " -> Synch Block Number: " + j);
			}
			System.out.println("-------------------------------");
		}
	}
}
