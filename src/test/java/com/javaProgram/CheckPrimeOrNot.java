package com.javaProgram;

public class CheckPrimeOrNot {

	public static void main(String[] args) {

		int flag = 0;
		int n = 77;
		if (n == 0 || n == 1) {
			System.out.println("0 and 1 not considered as a Prime Number");
		} else {
			for (int i = 2; i < n / 2; i++) {
				if (n % 2 == 1) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println("Given number is prime");
			} else {
				System.out.println("Given number is not a prime number");
			}
		}

	}

}
