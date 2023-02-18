package com.aurionpro.model;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("RAM");
		queue.add("KAM");
		queue.add("JAM");
		queue.add("SAM");

		// Printing the top element of PriorityQueue
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());

		System.out.println("\nIterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.remove();
		// Removing the top element of PriorityQueue
		queue.poll();

		System.out.println("\nAfter removing two elements:");
		itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
