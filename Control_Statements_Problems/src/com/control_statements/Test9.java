package com.control_statements;

import java.util.Scanner;

public class Test9 {
	public static void percentageOfAttendence(int held, int attended) {
		double percentage = ((double) attended / held) * 100;
		System.out.println("The total percentage of student is:"+ percentage);
		if(percentage<75) {
			System.out.println("Student will not be allowed to sit in the exam due to less percentage of attendence");
		}
		else {
			System.out.println("Student will be allowed to sit in the exam");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of classes held");
		int noOfClassesHeld = sc.nextInt();
		
		System.out.println("Enter the number of classes attended");
		int noOfClassesAttended = sc.nextInt();
		
		percentageOfAttendence(noOfClassesHeld,noOfClassesAttended);
	}

	
}
