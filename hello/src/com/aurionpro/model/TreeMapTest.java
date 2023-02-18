package com.aurionpro.model;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();

		map.put("RAM", 10);
		map.put("KAM", 30);
		map.put("JAM", 20);

		System.out.println(map);

		System.out.println();
		System.out.println(map.containsKey("RAM"));
		System.out.println();

		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}

}
