package com.aurionpro.test;

public class ArrayReferenceTest {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		converArrayToZero(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
//		for(int i:arr) {
//			System.out.println(i);
//		}

	}

	private static void converArrayToZero(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
		
	}

}
