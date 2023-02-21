package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamsTest {

	public static void main(String[] args) {
		// Creating Streams
		// int[] numbers = {10, 20, 30, 40};
		// Stream<int[]> of = Stream.of(numbers);
		// of.forEach((n)-> System.out.println(n));

		Stream<Integer> stream = Stream.of(10, 20, 30);
		// stream.forEach((n)-> System.out.println(n));
		// forEach is a Terminal Operation
		stream.forEach(System.out::println);

		System.out.println();
		Stream<String> StringStream = Stream.of("Abhi", "Jaiswal");
		StringStream.forEach(System.out::println);

		System.out.println();
		List<String> players = Arrays.asList("Abhi", "Jaiswal");

//		List<String> collect = players.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
//		System.out.println(collect);

		List<String> upperPlayers = new ArrayList<String>();

		//players.forEach(System.out::println);
		players.stream().forEach(System.out::println);
//		
//		for(int i = 0; i<players.size();i++) {
//			upperPlayers.add(players.get(i).toUpperCase());	
//		}
//		
//		System.out.println();
//		upperPlayers.stream().forEach(System.out::println);
		
		System.out.println();
		Stream<String> javaStream = Stream.generate(()->"Java").limit(5);
		javaStream.forEach(System.out::println);

		System.out.println();
		Stream<Integer> numberStream = Stream.iterate(1, n -> n+10).limit(5);
		numberStream.forEach(System.out::println);
		
		Builder<String> builder = Stream.builder();
		
		Stream<String> build = builder.add("Abhi")
				.add("Jaiswal")
				.build();
		
		System.out.println();
		build.forEach(System.out::println);
		
//		for(int x:numbers) {
//			System.out.println(x);
//		}
	}

}
