package com.atm_simulation;

import java.util.Scanner;

public class Game {
	private static int userGuess;
	private static int computerGuess;	
	
	public static int startGame(Scanner sc) {
		int score=0;
		while(true) {
			System.out.println("Enter your number upto 1-10 ");
			userGuess = sc.nextInt(10);			
			computerGuess = (int) (Math.random() * 10) + 1;
			System.out.println("Computer Generated Number is:"+computerGuess);
			if(computerGuess>=userGuess) {
				score++;				
			}
			else break;			
		}
		return score;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int finalScore=startGame(sc);
		System.out.println("Final score you earned is:"+ finalScore);

	}

}
