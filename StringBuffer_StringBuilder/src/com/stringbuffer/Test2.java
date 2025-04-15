package com.stringbuffer;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
				
		// 1. append
		sb.append("Code");
		
		// 2. indexOf
		System.out.println(sb.indexOf("C"));
		
		// 3. lastIndexOf
		System.out.println(sb.lastIndexOf("e"));
		
		// 4. insert
		sb.insert(0, "Python");
		System.out.println(sb);
		
		// 5. replace
		sb.replace(0, 6, "Java");
		System.out.println(sb);
		
		// 6. reverse
		sb.reverse();
		System.out.println(sb);
		
		// 7. delete
		sb.delete(0, 4);
		System.out.println(sb);
		
		// 8. capacity
		System.out.println(sb.capacity());
		
		// 9. length
		System.out.println(sb.length());
		
		// conversion from StringBuffer to String
		StringBuffer sb2 = new StringBuffer("Java Program");
		String string = sb2.toString();
		
		// conversion from String to StringBuffer
		StringBuffer stringBuffer = new StringBuffer(string);

	}

}
