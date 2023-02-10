package src.com.aurionpro.test;

import src.com.aurionpro.model.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		System.out.println("Inserting data at first: ");
		list.insertAtFirst(1);
		list.insertAtFirst(2);
		list.displayFirstToLast();
		System.out.println("size :" + list.getSize());
		
		System.out.println("\nInserting data at last: ");
		list.insertAtLast(3);
		list.insertAtLast(4);
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();
		
		System.out.println("\nInserting at particular index: ");
		list.insertAtIndex(5, 3);
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();
		
		System.out.println("\nLinked list backward traversal");
		list.displayLastToFirst();
		
		System.out.println("\nLinked list forward traversal");
		list.displayFirstToLast();

		System.out.println("\nDeleting at particular index: ");
		list.deleteAtIndex(2);
		System.out.println("Node at index 2 has been deleted");
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();

		System.out.println("\nDeleting first node: ");
		list.deleteFirstNode();
		System.out.println("First Node has been deleted");
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();

		System.out.println("\nDeleting last node: ");
		list.deleteLastNode();
		System.out.println("Last Node  has been deleted");
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();

		System.out.println("\nSearching particular data: ");
		list.searchNode(5);
		//list.displayFirstToLast();
	}
}
