package com.controlStatements;

public class Test15 {

	public static void main(String[] args) {
		int counter=0;
		for(int i=10;i>20;i++) {
			counter++;
		}
		System.out.println("Minimum number of execution -for loop: "+counter);
		
		
		int counter2=0;
		int i=10;
		while(i>20) {
			counter2++;
			i++;
		}
		System.out.println("Minimum number of execution -while loop :"+ counter2);
		
		int counter3 = 0;
		int j=10;
		do {
			counter3++;
		}while(j>20);
		System.out.println("Minium number of execution -do-while loop:"+ counter3);
		
		
		int[] arr = {1,2,3,4,5};
		for(int val:arr) {
			System.out.println(val);
		}

	}

}
