package com.control_statements;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X:");
		int X = sc.nextInt();
		
		System.out.println("Enter the value of Y:");
		int Y = sc.nextInt();
		
		System.out.println("Enter the value of Z:");
		int Z = sc.nextInt();
		
		int totalMoney = (X*5) + (Y*10);
		int maxNoChocolates = totalMoney/Z;
		System.out.println(maxNoChocolates);
	}

}
