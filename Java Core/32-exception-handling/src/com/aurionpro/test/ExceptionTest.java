package com.aurionpro.test;

import javax.management.RuntimeErrorException;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Inputs taken..");
			int c = a / b;
			System.out.println(c);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (RuntimeErrorException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block is executed.");
		}
		System.out.println("End of prog..");
	}

}
