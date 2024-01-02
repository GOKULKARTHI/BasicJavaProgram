package com.javaProgram;

public class CheckTheStringPalindrome {

	public static void toChecktheStringPalindrome(String str) {
		String res = "";
		for (int i = (str.length() - 1); i >= 0; i--) {
			char character = str.charAt(i);
			res = character + res;
		}
		if (str.equalsIgnoreCase(res)) {
			System.out.println(str + " is PALINDROME");
		} else {
			System.out.println(str + " is not PALINDROME");
		}
	}

	public static void main(String[] args) {
		toChecktheStringPalindrome("madam");
	}
}
