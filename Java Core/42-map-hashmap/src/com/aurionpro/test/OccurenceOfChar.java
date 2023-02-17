package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceOfChar {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();/// here key is char & value is integer

		String str = "R@AMA";
		System.out.println(map);

		for (int i = str.length() - 1; i >= 0; i--) {
			if (Character.isLetterOrDigit(str.charAt(i))) {//here character is wrapper class not map wala
				if (map.containsKey(str.charAt(i))) {
					int count = map.get(str.charAt(i));
					map.put(str.charAt(i), count + 1);
				} else {
					map.put(str.charAt(i), 1);
				}
			}
		}
		System.out.println(map);
	}

}
