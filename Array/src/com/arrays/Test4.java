package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

// One question that can solve multiple problems
// 1) Find the duplicate elements in an array
// 2) Find the first non-repeating character in string
// 3) Find the first repeating character in string
// 4) Find unique elements in an array
public class Test4 {
	public static void duplicateElements(int[] arr) {
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
//		traverse and store ele along with count
		
		for(int ele:arr) {
			if(map.containsKey(ele)) {
				map.put(ele, map.get(ele)+1);
			}
			else {
				map.put(ele, 1);
			}
		}
		
//		System.out.println(map);
		
//		Finding duplicate elements
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println("_____________________________________");
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,1,3,4,7,4,5,8,7,5};
		duplicateElements(arr);
		
	}

}
