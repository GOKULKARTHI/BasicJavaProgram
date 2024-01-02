package com.javaProgram;

import java.util.Arrays;

public class SortNumberInAscendingOrder {

	public static void main(String[] args) {

		int[] a = { 15, 47, 56, 48, 78, 95, 623, 321, 487, 244, 32355, 147, 182 };
		System.out.println("Before Sorting");
		for (int i : a) {

			System.out.print(i + " ");

		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After Sorting in Ascending order");
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
