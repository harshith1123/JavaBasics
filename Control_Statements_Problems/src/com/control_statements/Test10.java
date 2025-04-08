package com.control_statements;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a divisor:");
		int div = sc.nextInt();
		for(int i=1;i*i<=div;i++) {
			if(div%i==0) {
				System.out.println(i+" ");
				if(i!=(div/i)) {
					System.out.println("The second divisor:"+(div/i)+" ");
				}
			}
		}
	}

}
