package com.arrays;

public class Test2 {	
	    public static void main(String[] args) {
	        int[] arr = {1, 4, 20, 3, 10, 5};
	        int target = 33;

	        int start = 0, end = 0, sum = 0;
	        while (end < arr.length) {
	            sum += arr[end];

	            // Shrink window if sum exceeds target
	            while (sum > target && start <= end) {
	                sum -= arr[start];
	                start++;
	            }

	            // Check for target
	            if (sum == target) {
	                System.out.println("Subarray found from index " + start + " to " + end);
	                return;
	            }

	            end++;
	        }

	        System.out.println("No subarray found with given sum.");
	    }
	}


