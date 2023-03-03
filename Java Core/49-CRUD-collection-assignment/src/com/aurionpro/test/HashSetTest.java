package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// create hashset of String
		Set<String> names = new HashSet<String>();

		// add elements to back of the hashset
		names.add("RAM");
		names.add("KAM");
		names.add("JAM");
		System.out.println(names);

		// find out number of elements in the hashset
		int size = names.size();
		System.out.println("Size: " + size);

		// remove by value
		names.remove("KAM");
		System.out.println(names);

		// check if hashset contains specified element
		boolean isThere = names.contains("RAM");
		System.out.println(isThere);

		// check if hashset is empty
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
	}

}
