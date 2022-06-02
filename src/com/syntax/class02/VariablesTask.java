package com.syntax.class02;

public class VariablesTask {

	public static void main(String[] args) {
		//TASK:    name, last name, grade, city, state, phone number
		/*
		 * My name is ___ and my last name is ____
		 * I am A/B student
		 * I live in __city__ and ___state__
		 * And my phone number is _____
		 */
		
		String name="Kellie";
		
		String lastName="Aydin";
		
		char grade='A';
		
		String city="Johnson City";
		
		String state="Tennessee";
		
		String phoneNumber="423-747-7753";
				
				System.out.println("My name is "+name+" and my last name is "+lastName);
				System.out.println("I am "+grade+" student");
				System.out.println("I live in "+city+" and "+state);
				System.out.println("And my phone number is "+phoneNumber);
		
		/* 
		 * TASK B
		 * Change student’s city, state, phone number and grade. And print those updated values:
			Example:
			My name is __ and I moved to new city__ and new state__. 
			My new phone number is ___
		 */
				
		city= "Asheville";
		state= "North Carolina";
		phoneNumber="423-747-3142";
		grade='B';
		
		System.out.println("My name is "+name+" "+lastName+" and I moved to "+city+", "+state+".");
		System.out.println("My new phone number is "+phoneNumber+".");
		System.out.println("I am now a "+grade+" student.");

	}

}
