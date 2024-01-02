package com.javaProgram;

public class SortTheCharacterInString {

	public static void main(String[] args) {

		String str = "GoodBye";

		char[] c = str.toCharArray();
		
		System.out.println("Before Sorting");

		for (int i = 0; i < c.length; i++) {

			System.out.print(c[i]);
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}

		}
		System.out.println();
		System.out.println("After Sorting Character in Descending order");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}
}
