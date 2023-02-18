package com.aurionpro.model;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		stack.push("RAM");
		stack.push("KAM");
		stack.push("JAM");
		stack.push("SAM");

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		stack.pop();

		itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
