package com.javaProgram;

public class GivenNumberIsPalindromeOrNot {
	
	public static void main(String[] args) {
		
		int num = 242;
		int reverse = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			reverse = (reverse * 10) + rem;
			num = num / 10;
		}
		if (reverse==242) {
			System.out.println("Given number is PALINDROME");
		}else {
			System.out.println("Given number is not a PALINDROME");
		}
	}

}
