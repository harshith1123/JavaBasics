package com.control_statements;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		boolean prime = isPrime(n);
		if(prime) {
			System.out.println("Is a prime number");
		}
		else {
			System.out.println("Is not a prime number");
		}
	}
	
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2;i<n;i++) {
			if(n % i ==0) {
				return false;
			}
		}
		return true;
	}

}
