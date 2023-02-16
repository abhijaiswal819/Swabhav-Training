package com.aurionpro.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Integer> list = new HashSet<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		
		System.out.println(list.size());
		System.out.println();
		
		System.out.println(list);
		System.out.println();
		
		for(Integer x : list) {
			System.out.println(x);
		}
		System.out.println();
		
		list.forEach(System.out::println);
		System.out.println();
				
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
		list.remove(new Integer(30));
		System.out.println(list);
		
		System.out.println(list.contains(20));
		
		list.clear();;
		System.out.println(list);
	}

}
