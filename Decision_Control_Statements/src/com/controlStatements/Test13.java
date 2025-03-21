package com.controlStatements;

import java.util.Scanner;

public class Test13 {
	
	public static void checkTotalSalary(double salary,int year) {
		if(year>5) {
			double totalSalary = salary+ salary* 0.05;
			System.out.println("The total salary after bonus is:"+ totalSalary);
		}
		else {
			System.out.println("The total salary is:"+salary);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee salary and year of experience");
		double salary = sc.nextDouble();
		int year = sc.nextInt();
		checkTotalSalary(salary,year);

	}

}
