package com.syntax.class05;

import java.util.Scanner;

public class ScoresHomework {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your scores for the quiz, midterm, and final.");
		int quiz = scanner.nextInt();
		int midterm = scanner.nextInt();
		int finalScore = scanner.nextInt();

		if ((quiz + midterm + finalScore) / 3 >= 90) {
			System.out.println("Your grade right now is an A");
		} else if ((quiz + midterm + finalScore) / 3 < 90 && (quiz + midterm + finalScore) / 3 >= 70) {
			System.out.println("Your grade right now is a B");
		} else if ((quiz + midterm + finalScore) / 3 < 70 && (quiz + midterm + finalScore) / 3 >= 50) {
			System.out.println("Your grade right now is a C");
		} else {
			System.out.println("Your grade right now is a F");
		}
		
	

	}

}
