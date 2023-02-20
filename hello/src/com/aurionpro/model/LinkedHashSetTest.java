package com.aurionpro.model;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		set.add("RAM");
		set.add("KAM");
		set.add("JAM");
		set.add("SAM");

		System.out.println(set);

		//set.
		System.out.println("\nSize is: " + set.size());
		System.out.println("\nIs set Empty: " + set.isEmpty());

		System.out.println();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
