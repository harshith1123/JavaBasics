package com.control_statements;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X and Y:");
		int X =sc.nextInt();
		int Y = sc.nextInt();
		int totalEarnings;
		if(Y<=X) {
			totalEarnings =Y;
		}
		else {
			totalEarnings =X+2*(Y-X);
		}
		System.out.println(totalEarnings);
	}

}
