package com.syntax.class05;

import java.util.Scanner;

public class CityAndTempHomework {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What city do you live in?");
		String city=scanner.nextLine();
		
		System.out.println("What is the temperature there in Fahrenheit?");
		int temp=scanner.nextInt();
		
		System.out.println("The temperature in celsius in "+city+" is "+((temp-32)*5/9));

	}

}
