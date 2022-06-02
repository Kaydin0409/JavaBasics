package com.syntax.class05;

import java.util.Scanner;

public class BirthMonthHomework {

	public static void main(String[] args) {

		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your birth month");  //could you month.equalsIgnoreCase in case user puts march
		String month=input.next();
		
		if(month.equals("March")||month.equals("April")||month.equals("May")) {
			System.out.println("You were born in spring");
		}else if (month.equals("June")||month.equals("July")||month.equals("August")) {
			System.out.println("You were born in summer");
		}else if(month.equals("September")||month.equals("October")||month.equals("November")) {
			System.out.println("You were born in fall");
		}else {
			System.out.println("You were born in winter");
		}
		
		
		
		
		
		
		

	}

}
