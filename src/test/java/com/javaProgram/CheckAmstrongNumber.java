package com.javaProgram;

import java.util.Scanner;

public class CheckAmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int arm = isArmstrongOrNot(num);
		if (arm == num) {
			System.out.println(num + " is Armstrong number");
		} else {
			System.out.println(num + " is not Armstrong number");
		}
		sc.close();
	}

	public static int isArmstrongOrNot(int num) {
		int rem, sum = 0;
		while (num != 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		return sum;
	}

}