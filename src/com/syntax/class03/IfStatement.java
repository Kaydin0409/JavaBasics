package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		/*
		 * declare a variable rate.
		 * if rate is more than 5 --> I am not a buying a house
		 */
		
		double mortgageRate=4.5;
		
		if (mortgageRate>5) {
			
			System.out.println("I am not buying a house");	
		}
		
		if (mortgageRate<5) {
			
			System.out.println("I am buying a house");
		}
		
		/*
		 * declare 2 variables and check if num1 is bigger than num2
		 */
		
		int num1=99;
		int num2=10;
		
		if (num1>num2) {
			System.out.println(num1+" is bigger than "+num2); //99 is bigger than 10
		}
				
			//when the condition is true java will print the block of code for if statement
		
		/*
		 * declare temperature
		 * if temperature is higher than 75 then I will go for a walk
		 */
		
		int temperature=68;
		
		if (temperature>75) {
			System.out.println("I will go for a walk");
			
		}else {
			System.out.println("I am going to study Java");
		
		}
		
		char gender='m';
		
		if (gender=='f') {
			System.out.println("You like shopping");
		}else {
			System.out.println("You like watching sports");
		}
		
		
		String browser="chrome";
		
		if (browser.equals("chrome")) {
			System.out.println("All test cases will be executed");
		}else {
			System.out.println("I am not executing any test cases");
		}
		}
		

	}


