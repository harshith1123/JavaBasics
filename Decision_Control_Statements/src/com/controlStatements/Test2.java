package com.controlStatements;

public class Test2 {
	
	static boolean flag=false;
	
	public static boolean isEven(int num) {
//		if(num%2==0) {
//			return true;
//		}
//		return false;
		
		if(num%2==0) flag=true;
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(isEven(20));

	}

}
