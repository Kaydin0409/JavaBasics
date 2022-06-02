package com.syntax.class06;

import java.util.Scanner;

public class CountryHomework {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What country are you from?");
		String country=scanner.nextLine();
		
		String language;
		
		switch(country.toLowerCase()) {
		
		case "mexico":
			language="Spanish";
			break;
		case "australia":
			language="English";
			break;
		case "turkey":
			language="Turkish";
			break;
		case "italy":
			language="Italian";
			break;
		case "greece":
			language="Greek";
			break;
		case "usa":
			language="English";
			break;
		default:
			language="unknown";
		}
		
		System.out.println("You are from "+country+" and you speak "+language);

	}

}
