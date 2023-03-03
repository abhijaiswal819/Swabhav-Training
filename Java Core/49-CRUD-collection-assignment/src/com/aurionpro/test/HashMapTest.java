package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// create hashmap of String
		Map<Integer, String> names = new HashMap<>();

		// add elements to back of the hashmap
		names.put(1, "RAM");
		names.put(2, "KAM");
		names.put(3, "JAM");
		System.out.println(names);

		// insert element at specified position
		names.put(4, "SAM");
		System.out.println(names);

		// get specific element by key
		String str = names.get(2);
		System.out.println(str);

		// find out number of elements in the hashmap
		int size = names.size();
		System.out.println("Size: " + size);

		// remove by key
		names.remove(3);
		System.out.println(names);

		// remove by key & value
		names.remove(2, "KAM");
		System.out.println(names);

		// check if hashmap contains specified element
		boolean isThere = names.containsValue("RAM");
		System.out.println(isThere);

		// check if hashmap is empty
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
	}

}
