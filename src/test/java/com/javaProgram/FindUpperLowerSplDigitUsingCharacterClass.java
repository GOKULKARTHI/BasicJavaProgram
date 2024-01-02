package com.javaProgram;

import java.util.Iterator;

import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;

public class FindUpperLowerSplDigitUsingCharacterClass {

	public static void main(String[] args) {
		String str = "Gokulkarthickmech1994@gmail.com";
		String s = str.replace(" ", "");
		String cap = "";
		int upper = 0;
		String small = "";
		int lower = 0;
		String special = "";
		int spl = 0;
		String digit = "";
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				cap = cap + c;
				upper++;
			} else if (Character.isLowerCase(c)) {
				small = small + c;
				lower++;
			} else if (Character.isDigit(c)) {
				digit = digit + c;
				num++;
			} else {
				special = special + c;
				spl++;
			}
		}
		System.out.println("Capital letter :" + cap);
		System.out.println("Capital letter Count :" + upper);
		System.out.println("Small letter :" + small);
		System.out.println("Small letter Count :" + lower);
		System.out.println("Special Character :" + special);
		System.out.println("Special Character Count :" + spl);
		System.out.println("Digit :" + digit);
		System.out.println("Digit Count :" + num);
	}

}
