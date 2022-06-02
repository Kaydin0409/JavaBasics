package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {
	
	public static void main(String[] args) {
		
		//this is enhanced code of the Scores Homework.  Making code BETTER
		//now less System.out
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your scores for the quiz, midterm, and final.");
		int quiz = scanner.nextInt();
		int midterm = scanner.nextInt();
		int finalScore = scanner.nextInt();
		
		char grade;

		if ((quiz + midterm + finalScore) / 3 >= 90) {
			grade='A';
			
		} else if ((quiz + midterm + finalScore) / 3 < 90 && (quiz + midterm + finalScore) / 3 >= 70) {
			grade='B';
			
		} else if ((quiz + midterm + finalScore) / 3 < 70 && (quiz + midterm + finalScore) / 3 >= 50) {
			grade='C';
			
		} else {
			grade='F';
		}
		
		System.out.println("You are a "+grade+" student");
		
		if(grade=='A'||grade=='B') {
			System.out.println("You are doing great");
		}else {
			System.out.println("You need to study more");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
	


