package com.aurionpro.model;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int searchValue = 88;

		int res = binarySearch(array, 0, array.length - 1, searchValue);
		System.out.println("Binary Search Program");
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

	private static int binarySearch(int[] array, int beg, int end, int searchValue) {
		int mid;
		if (end >= beg) {
			mid = (beg + end) / 2;
			if (array[mid] == searchValue) {
				return mid + 1;
			} else if (array[mid] < searchValue) {
				return binarySearch(array, mid + 1, end, searchValue);
			} else {
				return binarySearch(array, beg, mid - 1, searchValue);
			}
		}
		return 0;
	}
}
