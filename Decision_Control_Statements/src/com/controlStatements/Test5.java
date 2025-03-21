package com.controlStatements;

import java.util.Scanner;

public class Test5 {
	
	public static String getGrade(int marks) {
		if(marks>80) return "Distinction";
		else if(marks<80 && marks >=60) return "First Division";
		else if(marks<60 && marks >=35) return "Second Division";
		else return "Try Next Year";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks:");
		int n = sc.nextInt();
		System.out.println(getGrade(n));

	}

}
