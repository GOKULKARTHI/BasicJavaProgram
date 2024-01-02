package com.javaProgram;

public class CountOddAndEvenNumber {

	public static void main(String[] args) {

		String num = "123";

		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i < num.length(); i++) {
			char character = num.charAt(i);
			int a = character;
			if (a % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even Count:" + evenCount);
		System.out.println("Odd Count :" + oddCount);

		
	}

}
