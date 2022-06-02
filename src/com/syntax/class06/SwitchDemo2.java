package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		/*
		 * Ask user where are you from
		 * Based on the country we will define favorite food
		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		String country, favoriteFood;
		
		System.out.println("What country are you from?");
		country=scan.nextLine();
		
		   					//switch(country.toLowerCase())takes the user input and makes it lower case.  Mexico becomes mexico.
							//switch(country.toUpperCase())takes the user input and makes it upper case.  mexico becomes MEXICO
							//make sure cases match the upper or lower case specified
		
			switch(country) {
			
			case "Mexico":
				favoriteFood="tacos";
				break;
			case "Canada":
				favoriteFood="poutine";
				break;
			case "Turkey":
				favoriteFood="lahmacun";
				break;
			case "Pakistan":
				favoriteFood="pati chai";
				break;
			case "Egypt":
				favoriteFood="koshary";
				break;
			case "USA":
				favoriteFood="burgers";
				break;
			default:
				favoriteFood="Unknown";
				}
		
				System.out.println("You are from "+country+", so your favorite food is "+favoriteFood);
				

	}

}
