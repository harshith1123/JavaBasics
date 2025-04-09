package com.string;

// Non-primitive: == (compare reference), equals()
public class Test2 {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Hello";
		String str2 = "hello";
		if(str == str2) {
			System.out.println("Points to same object");
		}
		else {
			System.out.println("Points to different objects");
		}
				
	}
}
