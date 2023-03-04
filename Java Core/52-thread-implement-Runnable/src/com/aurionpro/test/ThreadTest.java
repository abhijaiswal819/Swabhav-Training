package com.aurionpro.test;

import com.aurionpro.model.ThreadModel;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadModel test = new ThreadModel();
		Thread thread = new Thread(test);

		thread.start();
	}

}
