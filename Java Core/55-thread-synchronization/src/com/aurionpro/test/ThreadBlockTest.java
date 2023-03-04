package com.aurionpro.test;

import com.aurionpro.model.PrintBlockSynch;
import com.aurionpro.model.ThreadBlock;

public class ThreadBlockTest {

	public static void main(String[] args) {
		PrintBlockSynch numbers = new PrintBlockSynch();

		ThreadBlock synch = new ThreadBlock(numbers);
		ThreadBlock synch2 = new ThreadBlock(numbers);

		Thread th1 = new Thread(synch);
		Thread th2 = new Thread(synch2);

		th1.start();
		th2.start();
	}

}
