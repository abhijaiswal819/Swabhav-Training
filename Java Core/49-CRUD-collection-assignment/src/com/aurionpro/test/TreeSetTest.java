package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// create treeset of String
		TreeSet<String> names = new TreeSet<String>();

		// add elements to back of the treeset
		names.add("RAM");
		names.add("KAM");
		names.add("JAM");
		names.add("SAM");
		names.add("TAM");
		names.add("MAN");
		System.out.println(names);

		// find out number of elements in the treeset
		int size = names.size();
		System.out.println("Size: " + size);

		// find out first element in the treeset
		String first = names.first();
		System.out.println(names);

		// find out last element in the treeset
		String last = names.last();
		System.out.println(names);

		// remove by value
		names.remove("KAM");
		System.out.println(names);

		// removing out first element in the treeset
		String firstPoll = names.pollFirst();
		System.out.println(names);

		// removing out last element in the treeset
		String lastPoll = names.pollLast();
		System.out.println(names);

		// check if treeset contains specified element
		boolean isThere = names.contains("RAM");
		System.out.println(isThere);

		// check if treeset is empty
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
	}

}
