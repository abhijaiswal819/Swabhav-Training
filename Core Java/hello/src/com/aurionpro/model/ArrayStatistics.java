package com.aurionpro.model;

import java.util.Arrays;

public class ArrayStatistics {

	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		calculate(arr);
		median(arr);
		frequency(arr);
	}

	private static void frequency(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				i++;
				count++;
			}
			System.out.println("Frequency of " + arr[i] + " is " + count);
		}
	}

	static void median(int[] arr) {
		Arrays.sort(arr);
		if (arr.length % 2 != 0) {
			System.out.println("Median :" + arr[arr.length / 2]);
		} else {
			System.out.println("Median : " + (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0);
		}
	}

	private static void calculate(int[] arr) {
		int sum = 0, min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		float avg = (float) sum / arr.length;
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + avg);
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);
	}
}
