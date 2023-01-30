package com.aurionpro.model;

public class LinearSearch {

	public static void main(String[] args) {
		int array[] = { 34, 67, 56, 78, 64, 39, 95, 72, 86, 21 };
		int searchValue = 86;

		int res = linearSearch(array, searchValue);
		System.out.println("Linear Search Program");
		System.out.print("The elements of the array are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		System.out.println();
		System.out.println("Element to be searched is: " + searchValue);
		if (res == 0) {
			System.out.println("Element is not present in the array");
		} else {
			System.out.println("Element is present at " + res + " position of array");
		}
	}

	private static int linearSearch(int[] array, int searchValue) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchValue)
				return i + 1;
		}
		return 0;
	}
}
