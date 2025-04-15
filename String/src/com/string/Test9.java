package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test9 {
	
	public static void firstNonRepeatingCharacter(String s) {
		char[] c =s.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap();
		
		for(char ele:c) {
			if(map.containsKey(ele)) {
				map.put(ele, map.get(ele)+1);
			}
			else {
				map.put(ele,1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

	public static void main(String[] args) {
		String s="avfa";
		firstNonRepeatingCharacter(s);

	}

}
