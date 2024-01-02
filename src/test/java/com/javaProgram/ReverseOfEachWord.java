package com.javaProgram;

public class ReverseOfEachWord {

	public static void getReverseofEachWord(String str) {

		String res ="";
		String[] string = str.split(" ");
		for (String s : string) {
		String rev ="";
		for (int i = (s.length()-1); i >=0 ; i--) {
			char character = s.charAt(i);
			rev = rev+character;
		}
		res = res+rev+" ";
		}
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		getReverseofEachWord("Welcome to home");
	}
}
