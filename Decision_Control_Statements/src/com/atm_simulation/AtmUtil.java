package com.atm_simulation;

import java.util.Scanner;

public class AtmUtil {
	private static final int minBalance = 500;
	private static int currentBalance = minBalance;
	
	public static String deposit(Scanner sc) {
		System.out.println("Enter the amount to deposit");
		int depositedAmount = sc.nextInt();
		if(depositedAmount >= 100) {
			currentBalance+=depositedAmount;
			return "Amount Credited successfully";
		}
		return "Invalid Amount";
	}
	
	public static String WithdrawAmount(Scanner sc) {
		System.out.println("Enter the amount to be withdrawn:");
		int withdrawnAmount = sc.nextInt();
		if(withdrawnAmount<=(getBalance()-minBalance)) {
			currentBalance-=withdrawnAmount;
			return "Amount debited Successfully";
		}
		return "Insufficient Balance";
		
	}
	
	public static int getBalance() {
		return currentBalance;
	}
}
