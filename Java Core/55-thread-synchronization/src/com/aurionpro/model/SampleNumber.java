package com.aurionpro.model;

public class SampleNumber {

	synchronized public void printDetails() {
		for (int i = 0; i <= 2; i++) {
			System.out.println(Thread.currentThread().getName() + " -> Number: " + i);
		}
		System.out.println("---------------------------");
	}
}
