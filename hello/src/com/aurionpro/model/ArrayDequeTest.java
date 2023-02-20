package com.aurionpro.model;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

	public static void main(String[] args) {
		// Deque<String> deque = new ArrayDeque<String>();
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>(10);

		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);

		System.out.println(deque);

		deque.clear();

		// addFirst() method to insert the elements at the head
		deque.addFirst(564);
		deque.addFirst(291);

		// addLast() method to insert the elements at the tail
		deque.addLast(24);
		deque.addLast(14);
		
		System.out.println(deque);

		deque.remove(14);
		deque.poll();
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());

		System.out.println(deque);
		System.out.println();

		for (Integer x : deque) {
			System.out.println(x);
		}
	}

}
