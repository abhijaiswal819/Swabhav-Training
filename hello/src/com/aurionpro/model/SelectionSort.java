package com.aurionpro.model;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = { 65, 54, 33, 23, 41, 89, 71, 53, 90 };
		System.out.println("Selection Sort Program");
		System.out.println("Before sorting array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		selectionSort(array);

		System.out.println();
		System.out.println("After sorting array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	private static void selectionSort(int[] array) {
		int i, j, small;  
	    int n = array.length;  
	    for (i = 0; i < n-1; i++)  {  
	        small = i; 
	        for (j = i+1; j < n; j++)  
	        if (array[j] < array[small])  
	            small = j;  
	
	        int temp = array[small];  
	        array[small] = array[i];  
	        array[i] = temp;  
	    }
	}

}
