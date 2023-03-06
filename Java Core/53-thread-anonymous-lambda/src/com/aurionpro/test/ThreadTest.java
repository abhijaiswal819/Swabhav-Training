package com.aurionpro.test;

import com.aurionpro.model.ThreadModel;

public class ThreadTest {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Anonymous class.");
			}
		};
		Thread t = new Thread(r1);
		t.start();

		// Static reference
		Runnable r2 = ThreadTest::execute;
		Thread t2 = new Thread(r2);
		t2.start();
		//r2.run();

		// lambda function
		Runnable r3 = () -> System.out.println("Lamda Thread created.");
		Thread t1 = new Thread(r3);
		t1.start();
	}

	private static void execute() {
		System.out.println("Inside Static reference.");
	}
}
