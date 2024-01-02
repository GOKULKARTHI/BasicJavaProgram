package com.javaProgram;

public class FindUpperLowerSpecialCharInString {
	
	public static void main(String[] args) {
		String str = "Gokulkarthickmech1994@gmail.com";
		String s = str.replace(" ", "");
		String upper ="";
		int cap =0;
		String lower="";
		int small =0;
		String special="";
		int spl =0;
		String digit="";
		int num =0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int x = c;
			if (x>=65&&x<=90) {
				upper=upper+c;
				cap++;
			}else if (x>=97&&x<=122) {
				lower=lower+c;
				small++;
			}else if (x>=48&&x<=57) {
				digit=digit+c;
				num++;
			} else {
				special=special+c;
				spl++;
			}
		}
		System.out.println("Capital letter :"+upper);
		System.out.println("Capital letter Count :"+cap);
		System.out.println("Lower letter :"+lower);
		System.out.println("Lowercase letter Count :"+small);
		System.out.println("Special character :"+special);
		System.out.println("Special character Count :"+spl);
		System.out.println("Digit :"+digit);
		System.out.println("Digit Count :"+num);
		
		
	}

}
