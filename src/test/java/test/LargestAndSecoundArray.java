package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LargestAndSecoundArray {

	    public static void main(String[] args) {
	        int[] arr = {12,54};
	        findLargestAndSecondLargest(arr);
	    }

	    public static void findLargestAndSecondLargest(int[] arr) {
	       if (arr.length<2) {
			System.out.println("Array should have atleast two element");
			return;
		}
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest element");
	        } else {
	            System.out.println("Largest element: " + largest);
	            System.out.println("Second largest element: " + secondLargest);
	        }
	    }
	

	}


