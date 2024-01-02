package com.javaProgram;

import java.util.Arrays;

public class RemoveDuplicatesUsingSet {

	
	
	    public static int[] removeDuplicates(int[] arr) {
	        if (arr.length <= 1) {
	            return arr; // No duplicates possible in arrays of length 0 or 1
	        }

	        int writeIndex = 1;

	        for (int i = 1; i < arr.length; i++) {
	            int j;
	            for (j = 0; j < writeIndex; j++) {	
	                if (arr[i] == arr[j]) {
	                    break;
	                }
	            }
	            
	            if (j == writeIndex) {
	            
	                arr[writeIndex] = arr[i];
	                writeIndex++;
	            }
	        }
	        System.out.println(Arrays.toString(arr));
	        System.out.println(writeIndex);

	        return Arrays.copyOf(arr, writeIndex);
	    }

	    public static void main(String[] args) {
	        int[] originalArray = {1,2,3,1,3,2,1,2,3,1,3};
	        int[] result = removeDuplicates(originalArray);

	        System.out.println("Original Array: " + Arrays.toString(originalArray));
	        System.out.println("Array with Duplicates Removed: " + Arrays.toString(result));
	    }
	}
