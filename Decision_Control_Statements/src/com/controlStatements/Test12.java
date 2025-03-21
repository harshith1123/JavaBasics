package com.controlStatements;

import java.util.Scanner;

public class Test12 {
	public static void findTotalCost(int quantity) {
		int price = quantity*100;
		if(price> 1000) {
			double total = price - price * 0.1;
			System.out.println("The total cost after discount is:"+total);
		}
		else {
			System.out.println("The total cost is:"+price);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the quantity in unit:");
		int quantity = sc.nextInt();
		findTotalCost(quantity);

	}

}
