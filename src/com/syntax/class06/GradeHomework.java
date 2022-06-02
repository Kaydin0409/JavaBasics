package com.syntax.class06;

import java.util.Scanner;

public class GradeHomework {

	public static void main(String[] args) {
		/* Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your letter grade");
		String grade=scanner.next();
		String outcome;
		
		switch(grade.toUpperCase()) {
		
		case "A":
			outcome="Excellent";
			break;
		case "B":
			outcome="Good";
			break;
		case "C":
			outcome="Average";
			break;
		case "D":
			outcome="Bad";
			break;
		default:
			outcome="Not Acceptable";
		}
		System.out.println("Your grade is "+grade+" and this is "+outcome);
	}

}
