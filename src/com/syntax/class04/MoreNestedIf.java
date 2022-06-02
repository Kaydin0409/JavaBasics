package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		/*
		 * We need to check if repl was completed
		 * If repl is completed, we want to see:
		 * if you did 15 and more--> great job
		 * if you did more than 10-->good
		 * if less than 10-->try to complete all assignments
		 */
		
		boolean didRepl=true;
		int assignments;
		
		if (didRepl) {
			System.out.println("How many assignments did you complete?");
			assignments=11;
			if (assignments>=15) {
				System.out.println("You did a great job!");
			}else if (assignments>10) {
				System.out.println("you did a good job");
			}else {
				System.out.println("Please try to complete all Repl assignments.");
			}
			
		}else {
			System.out.println("You should complete your homework");
		}
		
	}

}
