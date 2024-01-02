package com.javaProgram;

import java.util.Arrays;

public class ReverseString {

	    public static int[] removeDuplicates(int[] arr) {
	       if(arr.length<=1){
	           return arr;
	       }
	       int writeIndex = 1;
	       for(int i =1;i<arr.length;i++){
	           int j;
	           for(j=0;j<writeIndex;j++){
	               if(arr[i]==arr[j]){
	                   break;
	               }
	           }
	           if(j==writeIndex){
	               arr[writeIndex]=arr[i];
	               writeIndex++;
	           }
	       }
	         return Arrays.copyOf(arr,writeIndex);
	    }

	    public static void main(String[] args) {
	        int[] arr = {14,56,76,23,98,76,35,67,14,56,23,98};
	        int[] result = removeDuplicates(arr);

	        
	        System.out.println("Array with Duplicates Removed: " + Arrays.toString(result));
	    }
	}


