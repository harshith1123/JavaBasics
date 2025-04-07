package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Test1 {

	public static void withoutSorting(int[] arr) {
		int count=0;
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
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			count=entry.getValue();
			int key=entry.getKey();
			int i=0;
			while(i<count) {
				System.out.print(entry.getKey()+",");
				i++;
			}
			
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {0,1,1,0,0,2,2,1,1};
		withoutSorting(arr);

	}

}
