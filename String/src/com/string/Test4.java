package com.string;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		
		String str ="Java";
		
		// concat
		str.concat(" World");
		
		// length
		System.out.println(str.length());
		
		// charAt
		System.out.println(str.charAt(2));
		
		// indexOf()
		System.out.println(str.indexOf('a'));
		
		// lastIndexOf()
		System.out.println(str.lastIndexOf('a'));
		
		// ==  -> comparing the reference
		String s2 = "Java";
		System.out.println(str == s2);
		
		// equals
		System.out.println(str.equals(s2));
		
		// substring 
		System.out.println(str.substring(1,3));
		
		//split
		String s3 = "Java Programming";
		String[] s = s3.split(" ");
		System.out.println(Arrays.toString(s));
		
		// toCharArray()
		System.out.println(Arrays.toString(s2.toCharArray()));
		
		// toUpperCase
		// toLowerCase
		
		// compare to -- gives the difference between two characters in terms of ASCII values
		String s4 ="hello";
		String s5 = "Hello";
		System.out.println(s4.compareTo(s5));
	}

}
