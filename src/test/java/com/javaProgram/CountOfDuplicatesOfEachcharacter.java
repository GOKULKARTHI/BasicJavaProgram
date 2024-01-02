package com.javaProgram;

import java.util.LinkedHashMap;

public class CountOfDuplicatesOfEachcharacter {

	public static void main(String[] args) {
		
		String str = "raining here";
		
		char[] character = str.toCharArray();
		
		LinkedHashMap<Character, Integer> l = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < character.length; i++) {
			if (l.containsKey(character[i])) {
				Integer count = l.get(character[i]);
				l.put(character[i], count+1);
			}else {
				l.put(character[i], 1);
			}
			
		}
		System.out.println(l);
	}
}
