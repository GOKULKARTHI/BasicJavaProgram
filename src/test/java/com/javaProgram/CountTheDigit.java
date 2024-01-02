package com.javaProgram;

import java.util.Scanner;

public class CountTheDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int rem = 0;
		int count = 0;
		while (num != 0) {
			rem = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println("Number of the Digit " + count);
	}

}
