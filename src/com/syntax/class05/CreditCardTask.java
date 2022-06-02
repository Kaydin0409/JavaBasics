package com.syntax.class05;

import java.util.Scanner;

public class CreditCardTask {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? If balance of the card is larger than 1000, 
		 * tell them to pay off immediately, otherwise you can tell them that they can spend more
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a credit card, true or false?");
		boolean card=scanner.nextBoolean();
		
		if(card) {
			System.out.println("What is the balance on your card?");
			double balance=scanner.nextDouble();
			if(balance>1000) {
				System.out.println("You need to pay balance off immediately");
			}else {
				System.out.println("You can spend more money");
			}
		}else {
			System.out.println("I can offer you a credit card");
		}
		
		

	}

}
