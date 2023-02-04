package com.aurionpro.model;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = { 65, 54, 33, 23, 41, 89, 71, 53, 90 };
		System.out.println("Bubble Sort Program");
		System.out.println("Before sorting array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		bubbleSort(array);

		System.out.println();
		System.out.println("After sorting array elements are - ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	private static void bubbleSort(int[] array) {
		int i, j, temp;
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
