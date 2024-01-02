package com.javaProgram;

import java.util.ArrayList;

public class AddEachOddAndEvenPairInAnArray {

	public static void main(String[] args) {

		int[] a = { 15, 65, 74, 84, 62, 35, 87, 94 };
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i = i + 2) {
			l.add(a[i]+a[i+1]);
		}

		System.out.println(l);
	}

}
