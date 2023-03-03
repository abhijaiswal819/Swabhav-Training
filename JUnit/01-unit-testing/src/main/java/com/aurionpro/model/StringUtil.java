package com.aurionpro.model;

public class StringUtil {

	String truncateAInFirst2Place(String str) {
		if(str.length()<=2 && str !=null) {
			str.replace("A", "");
		}
		else {
			String str1 = str.substring(0,2).replace("A", "");
			String str2 = str.substring(2);
			str = str1 + str2;
		}
		return str;
	}

	Boolean checkFirstandLast2Equal(String str) {
		if (((String) str.subSequence(0, 2)).equalsIgnoreCase((String) str.subSequence(str.length()-2, str.length()))) {
			return true;
		}
		return false;
	}
}
