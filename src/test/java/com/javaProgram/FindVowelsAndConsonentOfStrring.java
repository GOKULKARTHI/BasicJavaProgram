package com.javaProgram;

public class FindVowelsAndConsonentOfStrring {

	public static void main(String[] args) {

		String str = "All the best";
		String s = str.replace(" ", "");
		String vow = "";
		String con = "";
		int vowels = 0;
		int co = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {

				vow = vow + c;
				vowels++;

			} else {
				con = con + c;
				co++;
			}
		}
		System.out.println("Vowels in the given String :" + vow);
		System.out.println("Consonent in the given given String :" + con);
		System.out.println("Vowels count is " + vowels);
		System.out.println("Consonent count is " + co);
	}
}
