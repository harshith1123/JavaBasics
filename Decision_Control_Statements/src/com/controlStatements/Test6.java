package com.controlStatements;

import java.util.Scanner;

public class Test6 {
	
	public static String evenOrOdd(int n) {
		if(n%2==0) return "Even";
		else return "Odd";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int n = sc.nextInt();
		System.out.println(evenOrOdd(n));

	}

}
