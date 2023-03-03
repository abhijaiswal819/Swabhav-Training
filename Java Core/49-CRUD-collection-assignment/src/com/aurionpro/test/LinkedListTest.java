package com.aurionpro.test;

import java.util.Iterator;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();

		link.insertFirst(50);
		link.insertFirst(40);
		link.insertFirst(30);
		link.insertLast(60);
		link.insertLast(70);
		link.insert(10, 0);
		link.insert(50, 5);

		System.out.println("Displaying Linked List");
		link.display();

		System.out.println("\nDeleted First Item : " + link.deleteFirst());
		System.out.println("Displaying Linked List");
		link.display();

		System.out.println("\nDeleted Last Item : " + link.deleteLast());
		System.out.println("Displaying Linked List");
		link.display();

		System.out.println("\nInserting New Item at First : ");
		link.insertFirst(1);
		System.out.println("Displaying Linked List");
		link.display();

		System.out.println("\nDeleting item at 2nd position : " + link.delete(2));
		System.out.println("Displaying Linked List");
		link.display();

		System.out.println();
		link.search(60);

		System.out.println("\nIterate through LinkedList");
		Iterator<Integer> it=link.iterator();
		it.forEachRemaining(System.out::println);
	}

}
