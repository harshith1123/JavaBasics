package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

/* 1. reverse the string
 * 2. reverse the sentence without reversing word
 * 3. reverse the word without changing the position
 * 4. print all duplicate characters from given string
 */

public class Test5 {
	public static void reverseStringByCharacter(String str) {		
		char[] s =str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(s[i]+" ");			
		}
		System.out.println();
	}
	
	public static void reverseStringBySentence(String str) {
		String[] s =str.split(" ");
//		System.out.println(Arrays.toString(s));
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");			
		}
		System.out.println();
	}
	
	public static void reverseStringByWordWithoutChangingPosition(String str) {
		String[] s =str.split(" ");
//		System.out.print(Arrays.toString(s));
//		char[] s1 = s[0].toCharArray();
//		char[] s2 = s[1].toCharArray();
//		char[] s4 = s[3].toCharArray();
//		char[] s5 = s[4].toCharArray();
//		char[] s3 = s[2].toCharArray();
//		for(int i=s[0].length()-1;i>=0;i--) {
//			System.out.print(s1[i]+" ");
//		}
//		for(int i=s[1].length()-1;i>=0;i--) {
//			System.out.print(s2[i]+" ");
//		}
//		for(int i=s[2].length()-1;i>=0;i--) {
//			System.out.print(s3[i]+" ");
//		}
//		for(int i=s[3].length()-1;i>=0;i--) {
//			System.out.print(s4[i]+" ");
//		}
//		for(int i=s[4].length()-1;i>=0;i--) {
//			System.out.print(s5[i]+" ");
//		}
		for(int i=0;i<s.length;i++) {
			for(int j=s[i].length()-1;j>=0;j--) {
				char[]c= s[i].toCharArray();
				System.out.print(c[j]);
			}
			System.out.print(" ");
			
		}
		System.out.println();
		
	}
	
	public static void duplicateCharacters(String str2) {
		char[] c = str2.toCharArray();		
		Map<Character,Integer> map = new LinkedHashMap();
		
		for(char ele:c) {
			if(map.containsKey(ele)) {
				map.put(ele, map.get(ele)+1);
			}
			else {
				map.put(ele, 1);
			}
		}		
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey());
			}
		}
		System.out.println();
				
	}
	
	public static void checkAnagram(String s,String s1) {
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();
		boolean flag = false;
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c1.length;j++) {
				if(c[i]==c1[j]) {
					flag = true;					
				}
				else {
					flag = false;
				}
			}			
		}
		if(flag) {
			System.out.println("The two strings are anagram of each other");
		}
		else {
			System.out.println("The two strings are not anagram");
		}
	}
	
	public static void main(String[] args) {
		String str = "Java is a programming language";
		String str2 = "programming";
		String s = "army";
		String s1="maryu";
		reverseStringByCharacter(str);
		reverseStringBySentence(str);
		reverseStringByWordWithoutChangingPosition(str);
		duplicateCharacters(str2);
		checkAnagram(s,s1);
	}

}
