package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 31, 30, 40);
//		System.out.println(numberList);
//
////		for (int x : numberList) {
////			if (x % 10 == 0) {
////				System.out.println(x);
////			}
////		}
//
//		List<Integer> divisibleBy10 = new ArrayList<Integer>();
//		for (int x : numberList) {
//			if (x % 10 == 0) {
//				// System.out.println(x);
//				divisibleBy10.add(x);
//			}
//		}
//		System.out.println(divisibleBy10);
		
		numberList.stream().filter(n -> n%10==0).forEach(System.out::println);
		List<Integer> collect = numberList.stream().filter(n -> n%10!=0).collect(Collectors.toList());
		System.out.println(collect);

		List<String> friends = Arrays.asList("RAMA", "KAMAL", "JAMAKA", "SAM");
		List<String> collect1 = friends.stream().filter(n -> n.length() >=5).collect(Collectors.toList());
		System.out.println(collect1);
	}

}
