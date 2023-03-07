package com.aurionpro.test;

public class BufferAndBuilderToString {

	public static void main(String[] args) {
		// Creating objects of StringBuffer class
		StringBuffer sbr = new StringBuffer("Hello! ");
		StringBuilder sbdr = new StringBuilder("Everyone.");

		// Converting StringBuffer object to String
		// using toString() method
		String str = sbr.toString();

		// Printing the above string
		System.out.println("StringBuffer object to String : "+str);

		// Converting StringBuilder object to String
		String str1 = sbdr.toString();

		// Printing the above string
		System.out.println("StringBuilder object to String : "+str1);

		// Changing StringBuffer object sbr
		// but String object(str) doesn't change
		sbr.append("All.");

		// Printing the above two strings on console
		System.out.println(sbr);
		System.out.println(str);
	}

}
