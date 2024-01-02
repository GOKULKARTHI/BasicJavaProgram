package com.javaProgram;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a non-negative integer to calculate its factorial: ");
		int number = scanner.nextInt();

		if (number < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
		} else {
			long factorial = calculateFactorial(number);
			System.out.println("The factorial of " + number + " is: " + factorial);
		}

		scanner.close();
	}

	// Function to calculate factorial using recursion
	public static long calculateFactorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		return num * calculateFactorial(num - 1);
	}
}
