package com.aurionpro.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// create linkedhashmap of String
		Map<Integer, String> names = new LinkedHashMap<>();
		// add elements to back of the linkedhashmap
		names.put(1, "RAM");
		names.put(2, "KAM");
		names.put(3, "JAM");
		System.out.println(names);

		// insert element at specified position
		names.put(4, "SAM");
		System.out.println(names);

		// insert element at specified position if not present
		names.putIfAbsent(5, "RA");
		System.out.println(names);

		// replacing element at specified position
		names.replace(2, "TAM");
		System.out.println(names);

		// get specific element by key
		String str = names.get(2);
		System.out.println(str);

		// find out number of elements in the linkedhashmap
		int size = names.size();
		System.out.println("Size: " + size);

		// remove by key
		names.remove(3);
		System.out.println(names);

		// remove by key & value
		names.remove(2, "KAM");
		System.out.println(names);

		// check if linkedhashmap contains specified element
		boolean isThere = names.containsValue("RAM");
		System.out.println(isThere);

		// check if linkedhashmap is empty
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
	}

}
