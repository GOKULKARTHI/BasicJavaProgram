package com.javaProgram;

public class ProductOfTheDigit {
	
	public static void main(String[] args) {
		int num = 456;
		int product = 1,rem = 0;
		while (num!=0) {
			rem=num%10;
			product = product*rem;
			num = num/10;
		}
		System.out.println("product of the digit is "+product );
	}

}
