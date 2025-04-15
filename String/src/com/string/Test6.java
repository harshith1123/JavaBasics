package com.string;

// count the number of vowels in given string
public class Test6 {
	
	public static void countVowels(String str) {
		int count=0;
		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++) {
			switch(c[i]) {
				case 'a': count++;
				break;
				
				case 'e': count++;
				break;
				
				case 'i': count++;
				break;
				
				case 'o': count++;
				break;
				
				case 'u': count++;
				break;
				
				default: continue;
			}
		}
		System.out.println("The number of vowels in a given string are:"+count);
	}

	public static void main(String[] args) {
		String str = "Java Program";
		countVowels(str);

	}

}
