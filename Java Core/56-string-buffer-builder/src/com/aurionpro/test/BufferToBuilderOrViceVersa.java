package com.aurionpro.test;

public class BufferToBuilderOrViceVersa {

	public static void main(String[] args) {
		// Creating object of StringBuffer class and
        // passing our input string to it
        StringBuffer sbr = new StringBuffer("Hello! ");
 
        // Storing value StringBuffer object in String and
        // henceforth converting StringBuffer object to StringBuilder class
        String str = sbr.toString();
        StringBuilder sbl = new StringBuilder(str);
 
        // Printing the StringBuilder object on console
        System.out.println(sbl);
	}

}
