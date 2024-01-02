package com.javaProgram;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateWordFromString {

	public static void main(String[] args) {
		String str1 = "Elon musk Musk is is World Richest World Richest Trilliner ";
		String str = str1.toLowerCase();
		String res = "";

		String[] string = str.split(" ");

		LinkedHashSet<String> l = new LinkedHashSet<String>();
		for (int i = 0; i < string.length; i++) {
			l.add(string[i]);
		}
		for (String s : l) {
			String st = s.toString();

			for (int i = 0; i < st.length(); i++) {
				char character = st.charAt(0);
				String sub = st.substring(1);
				res = Character.toUpperCase(character)+sub+" ";
			}
			System.out.print(res);
		}
		
		
	}

}
