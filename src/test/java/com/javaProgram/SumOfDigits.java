package com.javaProgram;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 154;
		int rem,sum =0;
		while (num!=0) {
			rem = num%10;
			sum = sum+rem;//-->0+4=4;-->4+5=9;-->9+1=10;
			num=num/10;
		}
		System.out.println("Sum of the digits is "+sum);
	}
	
}
