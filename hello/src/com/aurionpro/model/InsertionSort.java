package com.aurionpro.model;

public class InsertionSort {

	public static void main(String[] args) {
		int array[] = { 65, 54, 33, 23, 41, 89, 71, 53, 90 };
		System.out.println("Insertion Sort Program");
		System.out.println("Before sorting array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		insertionSort(array);

		System.out.println();
		System.out.println("After sorting array elements are - ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	private static void insertionSort(int[] array) {
		int i, j, temp;
		for (i = 1; i < array.length; i++) {
			temp = array[i];
			j = i - 1;

			while (j >= 0 && temp <= array[j]) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}
	}

}
