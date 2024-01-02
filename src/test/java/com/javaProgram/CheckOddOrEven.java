package com.javaProgram;

public class CheckOddOrEven {
	
	
	public static void main(String[] args) {
		int [] num = {5,4,6,8,2,1};
	    int length = num.length;
		
	    for (int i = 0; i < length; i++) {
	    	if (num[i]%2==0) {
				System.out.println("Given number "+num[i]+" is even number");
			}else {
				System.out.println("Given number "+num[i]+" is odd number");
			}		
		}
	
	}

}
