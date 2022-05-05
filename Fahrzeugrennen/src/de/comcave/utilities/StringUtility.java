package de.comcave.utilities;

public class StringUtility {

	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	public static String repeatString(String s) {
		return s.concat(s);
	}
	
}
