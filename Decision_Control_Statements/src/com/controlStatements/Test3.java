package com.controlStatements;

public class Test3 {
	public static String isEvenOrOdd(int n) {
		if (n % 2 == 0)
			return "Even";
		else
			return "Odd";
	}
	public static String evenOrOdd(int n) {
		return n%2==0? "Even" : "Odd";
		
	}
	public static void main(String[] args) {
		System.out.println(isEvenOrOdd(43));
		System.out.println(evenOrOdd(34));
	}

}
