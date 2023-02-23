package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.aurionpro.model.Employee;

public class Assignment {

	public static void main(String[] args) {

		//
//		1. String[] names= {"Jayesh","Nimesh","Mahesh","Ramesh"};
//		Create an array and print using forEach loop
//		a.using names.stream().forEach
//		b. using Arrays.asList(names).forEach
//		c. using static reference method
		//
		String[] names = { "Jayesh", "Nimesh", "Mahesh", "Ramesh" };
		
		Stream<String> stream1 = Arrays.stream(names);
		System.out.println("Using names.stream().forEach:");
		stream1.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Using Arrays.asList(names).forEach:");
		Arrays.asList(names).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Using static reference method:");
		for (int i = 0; i < names.length; i++)
			System.out.println(names[i]);

		//
//		2.Create a file test.txt with 5 names of students
//		a. Print the lines of the files using fileReader
//		b. Using Stream
		//
		try {
			FileReader fr = new FileReader("D:\\SwabhavTechlab\\DEMO\\names.txt");
			int ch;

			System.out.println();
			System.out.println("Using FileReader:");
			while ((ch = fr.read()) != -1)
				System.out.print((char) ch);

			System.out.println("\n");
			System.out.println("Using Stream:");
			String fileName = "D:\\SwabhavTechlab\\DEMO\\names.txt";
			Stream<String> stream = Files.lines(Paths.get(fileName));
			stream.forEach(System.out::println);

			fr.close();
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		} catch (IOException e) {

		}

		//
//		3. String[] names= {"Jay","Nimesh","Mark","Mahesh","Ramesh"};
//		a. print names of first 3 students sorted in ascending order
//		b. print names of first 3 students sorted in ascending order if their names contain 'a'
//		c. print names of students sorted in descending order
//		d. print first 3 characters of names of students
//		e. print the names of the students that contains less than or equal to 4 characters
		//
		String[] names1= {"Jay","Nimesh","Mark","Mahesh","Ramesh"};
		
		System.out.println();
		System.out.println("Names of first 3 students sorted in ascending order:");
		Stream<String> stream2 = Arrays.stream(names1);
		stream2.sorted().limit(3).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Names of first 3 students sorted in ascending order if their names contain 'a':");
		Stream<String> stream3 = Arrays.stream(names1);
		stream3.filter(name -> name.toLowerCase().contains("a")).limit(3).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Names of students sorted in descending order:");
		Stream<String> stream4 = Arrays.stream(names1);
		stream4.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println();
		System.out.println("First 3 characters of names of students:");
		Stream<String> stream5 = Arrays.stream(names1);
		stream5.map(n -> n.substring(0, 3)).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Names of the students that contains less than or equal to 4 characters:");
		Stream<String> stream6 = Arrays.stream(names1);
		stream6.filter(name -> name.length() <= 4).forEach(System.out::println);		
		
		//
//		Create an integer arrayList
//		a. Find min and max in Integer arrayList
//		List<Integer> numbers=Arrays.asList(10,20,30,40,50,25,35,45);
		//
		System.out.println();
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,25,35,45);
		System.out.println("Minimum integer in arrayList: ");
		numbers.parallelStream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
		
		System.out.println();
		System.out.println("Maximum integer in arrayList: ");
		numbers.parallelStream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
		
	}

}
