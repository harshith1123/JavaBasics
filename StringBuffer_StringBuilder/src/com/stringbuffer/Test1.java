package com.stringbuffer;

public class Test1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append("Program");
		System.out.println(sb);
		System.out.println(sb.hashCode());

	}

}
