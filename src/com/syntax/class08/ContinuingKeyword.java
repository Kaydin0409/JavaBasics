package com.syntax.class08;

import java.util.Scanner;

public class ContinuingKeyword {

	public static void main(String[] args) {
		
		
		//continue: skips current execution/iteration
		//when java executes continue-->
		//go back to the beginning of the loop,
		//so rest of the code inside loop body will be skipped/ignored
		
		for(int i=1; i<=5; i++) {
			
			if(i==2) {
			continue;       //skips 2 and then continues on to 3
			}
			System.out.print(i+" ");
		}
		
		// print numbers from 1 to 10 except number 5 and 7
		
			for(int i=1; i<=10; i++) {
			
			if(i==5 || i==7) {
			continue;       
			}
			System.out.print(i+" ");
			}
		
		//print numbers from 1 to 50 except those that are divisible by 3
			
		for(int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		
		
			System.out.println();
			
			
			
			
		//Create a program that will keep asking user to apply for a credit card.
		//As soon as you get "yes" from a user program should stop asking
			
			Scanner scanner=new Scanner(System.in);
			
			String answer;
			
			do {
				System.out.println("Apply for a credit card");
				answer=scanner.nextLine();
				if(answer.equalsIgnoreCase("yes")) {
				System.out.println("Ok, we will apply for credit card");
					break;
				}
				
			}while(!answer.equalsIgnoreCase("yes"));

	}

}
