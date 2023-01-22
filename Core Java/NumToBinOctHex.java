package com.aurionpro.model;

import java.util.Scanner;

public class NumToBinOctHex {

	public static void main(String[] args) {
		System.out.println("Number conversion to Binary, Octal & Hexadecimal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number:");
		int num=sc.nextInt();
		
		System.out.println();
		System.out.println("By using built-in method: ");
		String bin = Integer.toBinaryString(num);
		System.out.println("Binary: " + bin);
		String oct = Integer.toOctalString(num);
		System.out.println("Octal: " + oct);
		String hex = Integer.toHexString(num);
		System.out.println("Hexadecimal: " + hex);
		
		System.out.println();
		System.out.println("By Manually: ");
		int copyNum = num;
		int brem = 0;
        String binary = "";
        while (copyNum > 0){
            brem = copyNum % 2;
            binary =  brem + binary;
            copyNum = copyNum/2;
        }
        System.out.println("Binary Equivalent of "+num+" is "+binary);
        
        copyNum = num;
        int orem = 0;
        String octal = "";
        while (copyNum > 0){
            orem = copyNum % 8;
            octal =  orem + octal;
            copyNum = copyNum/8;
        }
        System.out.println("Octal Equivalent of "+num+" is "+octal);
        
        copyNum = num;
        int hrem = 0;
        String hexa = "";
        char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (copyNum > 0){
            hrem = copyNum % 16;
            hexa =  hexaDecimals[hrem] + hexa;
            copyNum = copyNum/16;
        }
        System.out.println("Hexadecimal Equivalent of "+num+" is "+hexa);
        
	}

}
