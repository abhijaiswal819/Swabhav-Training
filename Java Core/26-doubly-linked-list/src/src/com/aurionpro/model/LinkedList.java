package src.com.aurionpro.model;

public class LinkedList {

	static class dllNode {
		int data;
		dllNode next;
		dllNode prev;
		dllNode(int data) {
			this.data = data;
		}
		public void displayData() {
			System.out.print(" " + data);
		}
	}

	private dllNode head;
	private dllNode tail;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private int size = 0;

	// constructor
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertAtFirst(int data) {
		dllNode newDllNode = new dllNode(data);
		// for the first element, head and tail both will point to it.
		if (isEmpty()) {
			tail = newDllNode;
		} else {
			head.prev = newDllNode;
		}
		newDllNode.next = head;
		head = newDllNode;
		size++;
	}

	public void insertAtLast(int data) {
		dllNode newDllNode = new dllNode(data);
		// for the first element, head and tail both will point to it.
		if (isEmpty()) {
			head = newDllNode;
		} else {
			tail.next = newDllNode;
			newDllNode.prev = tail;
		}
		tail = newDllNode;
		size++;
	}

	public void insertAtIndex(int data, int index) {
		if (index >= 0 && index <= size) {
			dllNode newDllNode = new dllNode(data);
			dllNode current = head;
			if (index == 0) {
				insertAtFirst(data);
			} else if (index == size) {
				insertAtLast(data);
			} else {
				for (int j = 0; j < index && current.next != null; j++) {
					current = current.next;
				}
				newDllNode.next = current;
				current.prev.next = newDllNode;
				newDllNode.prev = current.prev;
				current.prev = newDllNode;
				size++;
			}
		} else {
			System.out.println("Index " + index + " not valid for linked list of size " + size);
		}
	}

	public void deleteFirstNode() {
		if (head == null) {
			System.out.println("List is empty");
		}
		dllNode first = head;
		if (head.next == null) {
			tail = null;
		} else {
			head.next.prev = null;
		}
		head = head.next;
		size--;
	}

	public void deleteLastNode() {
		if (tail == null) {
			throw new RuntimeException("List is empty");
		}
		dllNode last = tail;
		if (head.next == null) {
			head = null;
		} else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		size--;
	}

	public void deleteAtIndex(int index) {
		if (index + 1 >= 0 && index + 1 <= size) {
			dllNode current = head;
			//remove at the start
			if (index == 0) {
				deleteFirstNode();
			}
			// remove at last
			else if (index == size - 1) {
				deleteLastNode();
			} else {
				for (int j = 0; j < index && current.next != null; j++) {
					current = current.next;
				}
				current.prev.next = current.next;
				current.next.prev = current.prev;
				size--;
			}
		} else {
			System.out.println("Index " + index + " not valid for linked list of size " + size);
		}
	}

	public void displayFirstToLast() {
		dllNode current = head;
		System.out.print("The doubly linked list is --> ");
		while (current != null) {
			current.displayData();
			current = current.next;
		}
		System.out.println("");
	}

	public void displayLastToFirst() {
		dllNode current = tail;
		System.out.print("The doubly linked list is --> ");
		while (current != null) {
			current.displayData();
			current = current.prev;
		}
		System.out.println("");
	}

	public void searchNode(int data) {
		//Node current will point to head
		dllNode current = head;
		int i=0;
		if (head == null) {
			System.out.println("Doubly linked list is empty");
			return;
		}
		System.out.println("Searching node with data " + data + " in doubly linked list");
		while (current != null) {
			if (current.data == data) {
				System.out.println("Node with data " + data + " is found at index "+i);
				break;
			}
			current = current.next;
			i++;
		}
	}
}