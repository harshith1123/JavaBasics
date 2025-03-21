package com.controlStatements;

import java.util.Scanner;

public class Test9 {
	public static void checkVowelOrConsonant(char c) {
		if(c=='a' || c=='e' || c=='i' || c=='0' || c=='u') {
			System.out.println("given character is vowel");
		}
		else {
			System.out.println("Given character is Consonant");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		checkVowelOrConsonant(c);
	}

}
