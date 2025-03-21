package com.controlStatements;

public class Test18 {
	
	public static void rightAngle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void leftAngle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void triangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		rightAngle(5);
		System.out.println("_______________________________________________");
		leftAngle(5);
		System.out.println("_______________________________________________");
		triangle(5);

	}

}
