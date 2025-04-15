package com.string;

import java.util.Arrays;

// Find a longest word in a string. Input: str="Java is a programming language"
public class Test7 {

	public static void longestWord(String str) {
		String[] s= str.split(" ");
		int longest =s[0].length();
		String longestWord = s[0];
		System.out.println(longestWord);
		for(int i=1;i<s.length;i++) {
			if(s[i].length()>longest) {
				longest = s[i].length();
				longestWord=s[i];
			}
		}
		System.out.println("The longest word in a given string is:"+longestWord);
	}
	public static void main(String[] args) {
		String str = "Java is a programming language";
		longestWord(str);
	}

}
