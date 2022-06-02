package com.syntax.class05;

import java.util.Scanner;

public class LoanHomework {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What amount of loan do you need?");
		int loan=scanner.nextInt();
		
		if(loan<=200000) {
			System.out.println("I will lend you the money");
		}else {
			System.out.println("I cannot lend you this money");
		}
		
		
		
		

	}

}
