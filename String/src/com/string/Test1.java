package com.string;

public class Test1 {
	public static void main(String[] args) {
		String str = "Java";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		System.out.println("_________________");
		str.concat("Code");
		System.out.println(str);
		System.out.println(str.hashCode());
		
//		str="problem";
//		System.out.println(str);
		
		System.out.println("_____________");
		str = str.concat("World");
		System.out.println(str);
		System.out.println(str.hashCode());
		
		System.out.println("_______________");
		System.out.println(str.concat("Program"));
		System.out.println(str.concat("Program").hashCode());  // this time also new object is created but with the unreferenced variable that's y by hashCode it is pointing to new id
		System.out.println(str.hashCode());  // this time it is giving me previous pointed id because the reference variable pointing to that object only
	}
}
