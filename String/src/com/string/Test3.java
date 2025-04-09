package com.string;

public class Test3 {

	public static void main(String[] args) {
		String s1= new String("Java");
//		s1="Java";
		String s2 = "Java";
		
		s1=s1.intern();
		System.out.println(s1==s2);

	}

}
