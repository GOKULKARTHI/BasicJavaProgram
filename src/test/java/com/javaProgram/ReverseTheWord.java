package com.javaProgram;

public class ReverseTheWord {
	
	public static void main(String[] args) {
	    // Input string
	    String str = "My name is gokul";

	    // Splitting the input string into words using space as the delimiter
	    String[] words = str.split(" ");

	    String reversedWordsWithSpaces = "";

	    // Iterating through each word in the array of words
	    for (int i = 0; i < words.length; i++) {
	        String reversedWord = reverseWord(words[i]);

	        // Concatenating reversed words with spaces
	        reversedWordsWithSpaces += reversedWord;

	        // Adding space after each word except for the last word
	        if (i < words.length - 1) {
	            reversedWordsWithSpaces += " ";
	        }
	    }

	    // Printing the concatenated reversed words with spaces
	    System.out.println(reversedWordsWithSpaces);
	}

	// Function to reverse a word
	public static String reverseWord(String word) {
	    String reversedWord = "";
	    System.out.println(word.length());
	    for (int i = word.length() - 1; i >= 0; i--) {
	        reversedWord += word.charAt(i);
	    }
	    return reversedWord;
	}

}
