package com.atm_simulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to ABC Bank.");		
		int attempt =1;
		char resp;
		while(attempt < 4) {
			System.out.println("Enter your pin to continue...");
			Scanner sc = new Scanner(System.in);
			int enteredPin = sc.nextInt();
			
			if(BankServer.validateLength(enteredPin) && enteredPin == BankServer.getPin()) {
//				System.out.println("correct pin");
				do {
					System.out.println("1. deposit 2. withdraw 3. balEnq");
					System.out.println("Select any one option");
					int option = sc.nextInt();
					
					switch(option) {
					case 1: System.out.println(AtmUtil.deposit(sc));
						break;
					case 2: System.out.println(AtmUtil.WithdrawAmount(sc));
							break;
					case 3: System.out.println(AtmUtil.getBalance());
							break;
					default: System.out.println("Invalid Option");
					}
					System.out.println("Do you want to continue: y/n");
					resp= sc.next().charAt(0);
				}while(resp=='y');
				break;
			}
			else {
				System.out.println("Wrong Pin.");
				System.out.println("Remaining attempts :"+(3-attempt));
				attempt++;
				if(attempt == 4) {
					System.out.println("Card blocked for next 24 hrs. Connect to your nearest branch");
				}
			}
		}
		System.out.println("Thanks for banking with us");
	}

}
