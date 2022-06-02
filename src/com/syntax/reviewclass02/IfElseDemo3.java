package com.syntax.reviewclass02;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in); //allows you to take the input from the keyboard
		
		
		System.out.println("Please Enter Your Account Balance");
		double accountBalance=scanner.nextDouble();
		
		System.out.println("Please Enter the amount that you wish to lend to your friend");
		double amountToLend=scanner.nextDouble();
		
		if(accountBalance>=amountToLend) {
			System.out.println("Yes I can help you");
		}else {
			System.out.println("Sorry, I don't have enough money to help you");
		}
		

		//Remember double can only handle numbers and not enter
		
		
		
			}
		
	}

	
	

