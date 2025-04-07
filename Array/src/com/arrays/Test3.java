package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;

// find the kth largest and smallest element in a given array

public class Test3 {
	public static void kSmallestElement(int[] arr,int k) {		
		PriorityQueue<Integer> obj = new PriorityQueue<>();
		int count=1;
		for(int ele:arr) {
			obj.add(ele);
		}
		System.out.println(obj.peek());
		while(count<k) {
			obj.poll();
			count++;
		}
		System.out.println("The kth smallest element in an array is:"+obj.peek());
	}
		
	public static void main(String[] args) {
		int[] arr= {4,8,1,6,9,2,12,10};
		int k = 4;
		int count =1;
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		for(int ele:arr) {
			priorityQueue.add(ele);
		}
		System.out.println(priorityQueue.peek()); // It will return head element in tree.
		
		while(count<k) {
			priorityQueue.poll();
			count++;
		}
		System.out.println(priorityQueue.peek());
		
		kSmallestElement(arr,k);
	}

}
