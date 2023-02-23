package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(2, 3, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 6);
		List<Integer> list3 = Arrays.asList(8, 7, 9);
		
		//Single List Result
//		List<Integer> mergeList = new ArrayList<>();
//		mergeList.addAll(list1);
//		mergeList.addAll(list2);
//		mergeList.addAll(list3);
//		System.out.println(mergeList);
		
		//Multiple List Result
		List<List<Integer>> mergeList = new ArrayList<>();
		mergeList.add(list1);
		mergeList.add(list2);
		mergeList.add(list3);
		System.out.println(mergeList);
		
		//Multiple List to Single List 
		List<Integer> resultList = new ArrayList<>();
//		for(List<Integer> x: mergeList) {
//			for(Integer y: x) {
//				if(!resultList.contains(i)) {
//					resultList.add(y);
//				}
//			}
//		}
//		System.out.println(resultList);
		
		//FlatMap only works for List of List
		List<Integer> collect = mergeList.stream().flatMap(list->list.stream()).distinct().collect(Collectors.toList());
		System.out.println(collect);
	}

}
