package com.control_statements;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n1=sc.nextInt();
		int n2= sc.nextInt();
		System.out.println("GCD of "+n1+" and "+n2+" is:"+gcd(n1,n2));
	}
	
	public static int gcd(int a, int b) {
		while(b!=0) {
			int temp =b;
			b = a%b;
			a =temp;
		}
		return a;
		
	}

}
