package com.javaProgram;

public class ReverseTheString {
	
public static void toReverseTheString(String str) {
	String reverseString = "";
	for (int i = (str.length()-1); i >=0; i--) {
		char character=str.charAt(i);
		reverseString = reverseString+character;
	}
	System.out.println(reverseString);
}
	public static void main(String[] args) {
		toReverseTheString("gokulkarthick");
	}

}
