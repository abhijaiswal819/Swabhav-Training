package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Student;

public class DeSerializationTest {

	public static void main(String[] args) {
		Student student = null;

		try {
			FileInputStream file = new FileInputStream("D:\\SwabhavTechlab\\DEMO\\test.txt");
			ObjectInputStream in = new ObjectInputStream(file);

			// method for deSerialization
			//typecasting from object type to Student type
			student = (Student) in.readObject();

			in.close();
			file.close();

			System.out.println("Student object Deserialized");
			System.out.println(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
