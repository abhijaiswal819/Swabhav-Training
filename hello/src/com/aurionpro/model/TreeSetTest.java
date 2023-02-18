package com.aurionpro.model;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// SortedSet<String> set = new TreeSet<String>();
		TreeSet<String> set = new TreeSet<String>();

		set.add("RAM");
		set.add("KAM");
		set.add("JAM");
		set.add("SAM");

		System.out.println(set);
		System.out.println("\n" + set.contains("KAM"));
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());

		System.out.println();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
