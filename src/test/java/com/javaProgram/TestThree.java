package com.javaProgram;

public class TestThree extends TestOne {
	
	int d =77;
	public void name() {
		
		int d = 88;
		System.out.println(super.d);
		
		
	}
	
	public static void main(String[] args) {
		TestThree f = new TestThree();
		f.name();
	}
	

}
