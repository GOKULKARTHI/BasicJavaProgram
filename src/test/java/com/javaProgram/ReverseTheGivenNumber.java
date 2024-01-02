package com.javaProgram;

public class ReverseTheGivenNumber {
	
	public static void main(String[] args) {
		
		int num = 45256423;
		int reverseNum = 0;
		int rem = 0;
	//			545256423-->true		
		while (num>0) {
			//rem=3,2
			//reverseNum =(0)+3==3,(3*10)+2--
			
			rem = num%10;
			reverseNum=(reverseNum*10)+rem;
			num=num/10;
		}
		System.out.println(reverseNum);
	
	}
}
