package com.controlStatements;

import java.util.Scanner;

public class Test11 {
	
	public static void checkSquareOrNot(int length,int breadth) {
		if(length == breadth) {
			System.out.println("It is square");
		}
		else {
			System.out.println("It is not a square");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length and breadth of a rectangle:");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		checkSquareOrNot(length,breadth);

	}

}
