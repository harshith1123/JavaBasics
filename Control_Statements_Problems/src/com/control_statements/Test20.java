package com.control_statements;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int originalNo = number;
		int reversed = 0;
		while(number!=0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number/=10;
		}
		
		if(originalNo == reversed) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The give number is not a palindrome");
		}

	}

}
