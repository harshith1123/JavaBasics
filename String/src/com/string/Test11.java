package com.string;

import java.util.HashMap;
import java.util.Map;

public class Test11 {

	public static void main(String[] args) {
		String s = "programming";
		String s1="";
		StringBuffer str = new StringBuffer(s);		
		char[] c = s.toCharArray();
		Map<Character,Integer> map = new HashMap<>(); 
		
		for(char ele:c) {
			if(map.containsKey(ele)) {
				map.put(ele,map.get(ele)+1);
			}
			else {
				map.put(ele, 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				s1+=entry.getKey();
			}
		}
		int j=0;	
		int count =0;
		int n=str.length();		
		for(int i=0;i<n-1;i++) {
			if(s1.charAt(j)==str.charAt(i)) {
				str.deleteCharAt(i);
				j++;
				count++;
				if(count==s1.length()) {
					break;
				}
			}
		}
		String string = str.toString();
		System.out.println(string);
		
	}

}
