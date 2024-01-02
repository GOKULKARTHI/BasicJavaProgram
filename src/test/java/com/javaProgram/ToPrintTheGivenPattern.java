package com.javaProgram;

public class ToPrintTheGivenPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			for (int k = 3 - i; k > 0; k--) {

				System.out.print(" ");

			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}
	}
}
