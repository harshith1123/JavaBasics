package com.control_statements;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the temperature in celsius:");
		float temp = sc.nextFloat();
		if(temp<20) {
			System.out.println("The temperature is cold");
		}
		else if(temp>20 && temp<30){
			System.out.println("The temperature is warm");
		}
	}

}
