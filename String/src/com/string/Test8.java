package com.string;


// Given two strings s1 and s2, the task is to find if s1 is a substring of s2. If yes, return the index of first occurrence, else return -1. Input s1="for" s2="abcforxyz"
public class Test8 {
	
	public static int findSubString(String s1,String s2) {
		String s="";		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {					
					s+=s2.charAt(j);
				}
			}
		}		
		if(s1.equals(s)) {
			for(int i=0;i<s2.length();i++) {
				if(s1.charAt(0)==s2.charAt(i)) {
					return i;					
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		String S1="for";
		String S2="abcdforxyz";
		int index = findSubString(S1,S2);
		System.out.println("The index of first occurence is:"+index);
	}

}
