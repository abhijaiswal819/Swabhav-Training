package com.aurionpro.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("D:\\SwabhavTechlab\\DEMO\\input.txt");
			FileWriter out = new FileWriter("D:\\SwabhavTechlab\\DEMO\\output.txt",false);

			System.out.println("Output of input.txt is: ");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
				out.write(c);
			}
			out.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
