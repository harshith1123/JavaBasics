package com.controlStatements;

import java.util.Scanner;

public class Test8 {
	public static void greaterNumber(int num1,int num2) {
		if(num1>num2) {
			System.out.println("First Number is Greater");
		}
		else {
			System.out.println("Second Number is greater");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer");
		int val1 = sc.nextInt();
		
		System.out.print("Enter second integer");
		int val2 = sc.nextInt();
		greaterNumber(val1,val2);

	}

}
