package com.aurionpro.model;

public class MergeSort {

	public static void main(String[] args) {
		int array[] = { 65, 54, 33, 23, 41, 89, 71, 53, 90 };
		System.out.println("Merge Sort Program");
		System.out.println("Before sorting array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		mergeSort(array, 0, array.length - 1);

		System.out.println();
		System.out.println("After sorting array elements are - ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	private static void mergeSort(int[] array, int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			mergeSort(array, beg, mid);
			mergeSort(array, mid + 1, end);
			merge(array, beg, mid, end);
		}
	}

	private static void merge(int[] array, int beg, int mid, int end) {
		int i, j, k;
		int n1 = mid - beg + 1;
		int n2 = end - mid;

		int LeftArray[] = new int[n1];
		int RightArray[] = new int[n2];

		for (i = 0; i < n1; i++)
			LeftArray[i] = array[beg + i];

		for (j = 0; j < n2; j++)
			RightArray[j] = array[mid + 1 + j];

		i = 0;
		j = 0;
		k = beg;

		while (i < n1 && j < n2) {
			if (LeftArray[i] <= RightArray[j]) {
				array[k] = LeftArray[i];
				i++;
			} else {
				array[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = RightArray[j];
			j++;
			k++;
		}
	}

}
