package com.aurionpro.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("RAM", 10);
		map.put("JAM", 30);
		map.put("KAM", 20);
		map.put("SAM", 40);

		System.out.println(map);
		System.out.println();

		//map.put("RA", 10);
		map.replace("RAM", 50);
		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());

		System.out.println();
		// Returns a Set view of the mappings contained in this map
		System.out.println(map.entrySet());
	}

}
