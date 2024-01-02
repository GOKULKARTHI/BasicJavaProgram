package com.javaProgram;

public class TestOne {

	int i = 10;
	String name = "Sowmi";
	double d = 0.5;

	public void test() {
		double d = 0.2;
		System.out.println(i);
		System.out.println(name);
		System.out.println(this.d);
	}

	public static void main(String[] args) {

		TestOne t = new TestOne();
		t.test();

	}
}
