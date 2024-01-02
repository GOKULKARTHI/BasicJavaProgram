package com.javaProgram;

import java.util.LinkedHashSet;

public class RemoveCharacterDuplicatesFromString {
	public static void main(String[] args) {
		String str = "aabbccccddddd";
		String res ="";
		LinkedHashSet<Character> l = new LinkedHashSet<Character>(); 
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i); 	
			l.add(character);
		}
		for (Character c : l) {
			res=res+c;
		}
		System.out.println(res);
	}

}
