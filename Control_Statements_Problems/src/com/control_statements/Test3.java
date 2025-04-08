package com.control_statements;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first number:");
		int n1 =sc.nextInt();
		System.out.println("Enter a second number:");
		int n2 = sc.nextInt();
		if(n1>n2) {
			System.out.println("The first number is greater");
		}
		else {
			System.out.println("The second number is greater");
		}

	}

}
