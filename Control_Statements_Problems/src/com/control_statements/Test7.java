package com.control_statements;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of purchased quantity:");
		int quantity = sc.nextInt();	
		
		int price =quantity * 100;
		double total =price;
		if(price>1000) {
			total = price - price*0.10;
			System.out.println("The total cost after discount is:"+total);
		}
		else {
			System.out.println("The total cost is:"+total);
		}
		
	}

}
