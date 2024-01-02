package com.javaProgram;

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		
		//for example-->4!==4*3*2*1=24;-->n*(n-1)*(n-2)*(n-3)
		
		int fact = 1;
		int num = 10;
		for (int i = 1; i <=num; i++) {
			fact=fact*i;//--->1*1
		}
		System.out.println(fact);
	}

}
