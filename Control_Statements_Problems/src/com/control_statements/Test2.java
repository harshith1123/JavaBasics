package com.control_statements;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int n =sc.nextInt();
		if(n<0) {
			System.out.println("The number is negative");
		}
		else if(n>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is zero");
		}

	}

}
