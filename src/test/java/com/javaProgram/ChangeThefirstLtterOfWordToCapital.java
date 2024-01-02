package com.javaProgram;

public class ChangeThefirstLtterOfWordToCapital {
	
	public static void toChangeThefirstLtterOfWordToCapital(String str) {
	String res="";
	String[] string = str.split(" ");
	for (String s : string) {
		char character = s.charAt(0);
		String substring = s.substring(1);
		res=res+Character.toUpperCase(character)+substring+" ";
	}
		System.out.println(res);
	}
	public static void main(String[] args) {
		toChangeThefirstLtterOfWordToCapital("to change the first letter of the each word to capital letter");
	}
	
}
