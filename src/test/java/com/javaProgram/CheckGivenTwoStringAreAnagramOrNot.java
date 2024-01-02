package com.javaProgram;

import java.util.Arrays;

public class CheckGivenTwoStringAreAnagramOrNot {

	public static void main(String[] args) {

		String s1 = "adbc";
		String s2 = "dbca";
		
		if (s1.length() == s2.length()) {
			
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean x = Arrays.equals(c1, c2);

			if (x==true) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not anagram-Exactly character are not matching");
			}
			
		}else {
			System.out.println("Not Anagram-Length not equal");
		}

	}
}