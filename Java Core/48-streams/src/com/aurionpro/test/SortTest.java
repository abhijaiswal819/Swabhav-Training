package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10, 23, 45, 6, 7, 21);
		//Collections.sort(asList);
		//Collections.sort(numList, Collections.reverseOrder());
		List<Integer> collect = numList.stream().filter(n->n%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//System.out.println(numList);
		System.out.println(collect);
		
		List<String> strList = Arrays.asList("RAM", "KAM", "JAM", "SAM");
		//Collections.sort(asList);
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println(strList);
	}

}
