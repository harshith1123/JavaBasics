package com.control_statements;

import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		int reversedNumber = 0;
		while(no!=0) {
			int digit = no % 10;
			reversedNumber = reversedNumber * 10+digit;
			no/=10;
		}
		System.out.println("The reversed number is:"+reversedNumber);;
	}
}
