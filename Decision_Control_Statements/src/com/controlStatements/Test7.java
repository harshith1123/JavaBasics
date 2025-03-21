package com.controlStatements;

import java.util.Scanner;

public class Test7 {
	public static void guessNumber(int n) {
		if(n>0) {
			System.out.println("Positive Number");
		}
		else if(n<0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Number is Zero");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n = sc.nextInt();
		guessNumber(n);
	}

}
