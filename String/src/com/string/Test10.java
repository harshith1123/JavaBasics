package com.string;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String input = sc.nextLine();
		
		String original = input.toLowerCase().replaceAll("[^a-z0-9]","");
		String reversed = "";
		
		for(int i=original.length()-1;i>=0;i--) {
			reversed+=original.charAt(i);
		}
		
		if(original.equals(reversed)) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}
	}

}
