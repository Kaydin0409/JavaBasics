package com.syntax.class06;

import java.util.Scanner;

public class HomeworkSale {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter value for sale: yes or no
		 * if there is no sale-->you are not going shopping
		 * if there is sale ask user which item they want to buy and its price
		 * based on the price you have to calculate the price of the item after the discount
		 * discount rule: if price is less than $20-->apply 10%
		 * if price is between $20 & $100--> 20%
		 * if price is between $100 & $500-->30%
		 * otherwise apply 50% discount
		 * After discount __ the price of the item is reduced from ___ to _____
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Is there a sale, true or false?");
		Boolean sale=scanner.nextBoolean();
		
		String discount;
		
		if(!sale) {
			System.out.println("You are not going shopping today");
		}else {
			System.out.println("What is the price of the item you want to buy?");
			double price=scanner.nextDouble();
			if(price<20) {
				discount="10 percent";
				double finalPrice=(price-(price*.10));
				System.out.println("After discount of "+discount+" the price of the item is reduced from "+price+" to "+finalPrice);
			}else if (price>=20&&price<=100) {
				discount="20 percent";
				double finalPrice=(price-(price*.20));
				System.out.println("After discount of "+discount+"the price of the item is reduced from "+price+" to "+finalPrice);
			}else if (price>=100&&price<=500) {
				discount="30 percent";
				double finalPrice=(price-(price*.30));
				System.out.println("After discount of "+discount+"the price of the item is reduced from "+price+" to "+finalPrice);
			}else {
				discount="50 percent";
				double finalPrice=(price-(price*.50));
				System.out.println("After discount of "+discount+"the price of the item is reduced from "+price+" to "+finalPrice);
			}
		}
			
	}

}
