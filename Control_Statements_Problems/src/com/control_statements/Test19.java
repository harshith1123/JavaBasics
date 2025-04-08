package com.control_statements;

import java.util.Scanner;

public class Test19 {
	
	
	public static void leftAngledTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of patterns do you to print:");
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	public static void rightAngledTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of patterns do you to print:");
		int rows =sc.nextInt();
		for(int i=1;i<rows;i++) {
			for(int j=i;j<=rows;j++) {
				if(j<=rows-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
	public static void reverseLeftAngledTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of patterns do you to print:");
		int rows =sc.nextInt();
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	public static void reverseRightAngledTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of patterns do you to print:");
		int rows =sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		leftAngledTriangle();
		rightAngledTriangle();
		reverseLeftAngledTriangle();
		reverseRightAngledTriangle();

	}

}
