package com.controlStatements;

public class Test4 {
	static boolean flag=false;
	
	public static boolean isPositiveEven(int n) {
//		if(n>0) {
//			if(n%2==0) {
//				flag=true;
//			}
//		}
//		return flag;
//
//	}
		return (n>0)?(n%2==0)? true :false: false;
	}

	public static void main(String[] args) {
		System.out.println(isPositiveEven(-22));

	}

}
