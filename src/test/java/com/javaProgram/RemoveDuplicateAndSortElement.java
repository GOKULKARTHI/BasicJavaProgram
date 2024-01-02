package com.javaProgram;

import java.util.TreeSet;

public class RemoveDuplicateAndSortElement {

	public static void main(String[] args) {
		
		int[]a={45,41,8,2,48,96,74,84,965,35};
		
		TreeSet<Integer> l = new TreeSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}
	System.out.println(l);
	}
}
