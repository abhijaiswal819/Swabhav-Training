package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "RAM");
		map.put(2, "SAM");
		map.put(3, "KAM");
		map.put(4, "JAM");
		
		System.out.println(map);
		
		//Set<Entry<Integer, String>> entrySet = map.entrySet();//type map.entrySet() then press ctrl+1
		System.out.println();
		for (Entry<Integer, String> set: map.entrySet()) {
			System.out.println(set.getKey()+" : "+set.getValue());
		}
		
		map.remove(2);
		int Ikey=0;
		for (Entry<Integer, String> set: map.entrySet()) {
			if(set.getValue().equals("KAM")) {
				//map.remove(set.getKey()); ////COncuurent modification is not allowed (means during iterating u can't delete/modify)
				Ikey=set.getKey();
			}
		}
		map.remove(Ikey);
		
		System.out.println();
		map.forEach((key,value)->System.out.println(key+" : "+value));
		
		System.out.println();
		for(Integer x: map.keySet()) {
			System.out.println(x+" : "+map.get(x));
		}
	}

}
