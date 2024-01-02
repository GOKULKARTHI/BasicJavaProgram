package com.javaProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <=10; i++) {
			int c = a+b;
			if (c<=100) {
				System.out.println(c);	
			}
			a=b;
			b=c;
		}
		
	}
}
