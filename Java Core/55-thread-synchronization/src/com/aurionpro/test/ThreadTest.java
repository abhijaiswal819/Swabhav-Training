package com.aurionpro.test;

import com.aurionpro.model.SampleNumber;
import com.aurionpro.model.ThreadModel;

public class ThreadTest {

	public static void main(String[] args) {
		SampleNumber numbers = new SampleNumber();

		ThreadModel synch = new ThreadModel(numbers);
		ThreadModel synch2 = new ThreadModel(numbers);

		Thread th1 = new Thread(synch);
		Thread th2 = new Thread(synch2);
		
		th1.start();
		th2.start();
	}

}
