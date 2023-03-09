package com.aurionpro.test;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "Hello! ";
		StrConcat(str1);
		System.out.println("The final String is - " + str1);

		StringBuffer str2 = new StringBuffer("Hello! ");
		StrBufConcat(str2);
		System.out.println("The final String Buffer is - " + str2);

		StringBuilder str3 = new StringBuilder("Hello! ");
		StrBuildConcat(str3);
		System.out.println("The final String Builder is -" + str3);
	}

	public static void StrConcat(String str1) {
		str1 = str1 + "Everyone.";
		//System.out.println(str1);
		//In this method, we pass a string “Hello! ” and perform “str1 = str1 + "Everyone.". The string passed from main() is not changed, 
		//this is due to the fact that String is immutable. Altering the value of string creates another object and str1 in StrConcat() 
		//stores reference of the new string. References str1 in main() and StrConcat() refer to different strings.
	}

	public static void StrBufConcat(StringBuffer str2) {
		str2.append("Everyone.");
		//StringBuilder is similar and can be compatible at all places to StringBuffer except for the key difference of thread safety. 
		//StringBuffer is thread-safe while StringBuilder does not guarantee thread safety which means synchronized methods are present in 
		//StringBuffer making control of one thread access at a time while it is not seen in StringBuilder, hence thread-unsafe.
	}

	public static void StrBuildConcat(StringBuilder str3) {
		str3.append("Everyone.");
		//In this method, we pass a string “Hello! ” and perform “str3.append("Everyone.")” which changes the actual value of the string 
		//(in main) to “Hello! Everyone.”. This is due to the simple fact that StringBuilder is mutable and hence changes its value.
	}
}
