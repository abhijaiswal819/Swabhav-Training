package com.aurionpro.model;

public class QuickSort {

	public static void main(String[] args) {
		int array[] = { 65, 54, 33, 23, 41, 89, 71, 53, 90 };
		System.out.println("Quick Sort Program");
		System.out.println("Before sorting array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		quickSort(array, 0, array.length - 1);

		System.out.println();
		System.out.println("After sorting array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int p = partition(array, start, end);
			quickSort(array, start, p - 1);
			quickSort(array, p + 1, end);
		}
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = (start - 1);

		for (int j = start; j <= end - 1; j++) {
			if (array[j] < pivot) {
				i++;
				int t = array[i];
				array[i] = array[j];
				array[j] = t;
			}
		}
		int t = array[i + 1];
		array[i + 1] = array[end];
		array[end] = t;
		return (i + 1);
	}

}
