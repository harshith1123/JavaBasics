package com.control_statements;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of salary and experience of an employee:");
		double salary =sc.nextInt();
		int year = sc.nextInt();
		if(year>5) {
			salary = salary+salary*0.05;
			System.out.println("The total salary of an employee is:"+salary);
		}
		else {
			System.out.println("The salary of an employee is:"+salary);
		}
	}

}
