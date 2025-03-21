package com.controlStatements;

import java.util.Scanner;

public class Test10 {
	public static void checkTemperature(float temp) {
		if(temp<20) {
			System.out.println("Weather is Cold");
		}
		else if(temp>20 && temp<=30) {
			System.out.println("Weather is Warm");
		}
		else {
			System.out.println("Weather is Hot");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temeperature in Celscius");
		float temp = sc.nextFloat();
		checkTemperature(temp);
	}

}
