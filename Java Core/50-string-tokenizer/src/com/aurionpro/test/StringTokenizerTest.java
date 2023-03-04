package com.aurionpro.test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// boolean values
		String text = "one two, three four; five. six;; 7";
		StringTokenizer stringTokens = new StringTokenizer(text, ",;. ", true);
		System.out.println(" Tokens count Token = " + stringTokens.countTokens());
		
		System.out.println();
		while (stringTokens.hasMoreTokens()) {
			System.out.println(" Token no = " + stringTokens.countTokens() + " Token = " + stringTokens.nextToken());
		}
		
		System.out.println();
		String[] arr =  text.split(";");
		System.out.println(Arrays.toString(arr));
	}

}
