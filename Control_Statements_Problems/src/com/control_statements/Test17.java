package com.control_statements;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance between home to office:");
		int X  = sc.nextInt();
		System.out.println("Enter the number of days opens in a week:");
		int Y = sc.nextInt();
		
		int totalDistance = X + X;
		int totalKmTravelled = totalDistance + Y;
		System.out.println("The total number of kilometers travels through office trips in a week are:"+totalKmTravelled);

	}

}
