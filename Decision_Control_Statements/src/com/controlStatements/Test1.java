package com.controlStatements;

public class Test1 {
	
	static boolean flag = true;
	
	public static void m1() {
		if(!flag) {
			System.out.println("if block executed");
		}
	}

	public static void main(String[] args) {
		System.out.println("main started...");
		m1();
		System.out.println("main ended.");
	}

}
