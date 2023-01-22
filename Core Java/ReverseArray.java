package com.aurionpro.model;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};

		System.out.println("Before Reversed Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "  ");
		}     
		System.out.println();
		System.out.println();
		System.out.println("After Reversed Array(without using another array):");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + "  ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("After Reversed Array(using another array):");
		int[] tempArr = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i<arr.length;i++) {
            tempArr[j - 1] = arr[i];
            j = j - 1;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(tempArr[k] + "  ");
        }
	}
}
