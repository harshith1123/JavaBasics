package com.control_statements;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number:");
		int A = sc.nextInt();
		if(A % 2==0 && A% 7==0) {
			System.out.println("Alice takes it home");
		}
		else if(A % 2!=0 && A % 9==0) {
			System.out.println("Bob takes it home");
		}
		else {
			System.out.println("Charlie takes it home");
		}
	}

}
