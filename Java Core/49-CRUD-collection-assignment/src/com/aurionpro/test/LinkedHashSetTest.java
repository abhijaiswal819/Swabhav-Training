package com.aurionpro.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// create linkedhashset of String
		Set<String> names = new LinkedHashSet<String>();

		// add elements to back of the linkedhashset
		names.add("RAM");
		names.add("KAM");
		names.add("JAM");
		System.out.println(names);

		// find out number of elements in the linkedhashset
		int size = names.size();
		System.out.println("Size: " + size);

		// remove by value
		names.remove("KAM");
		System.out.println(names);

		// check if linkedhashset contains specified element
		boolean isThere = names.contains("RAM");
		System.out.println(isThere);
		
		// check if linkedhashset is empty
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
	}


}
