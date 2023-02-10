package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Student;

public class SerializationTest {

	public static void main(String[] args) {
		try {
			Student student = new Student(101, "RAM", 86.5);

			// create obj of fileOutputStream
			FileOutputStream file = new FileOutputStream("D:\\SwabhavTechlab\\DEMO\\test.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			// method for serialization
			out.writeObject(student);
			file.close();

			System.out.println("Student object serialized");
			System.out.println(student);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
