package com.syntax.class14;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters,
		 * numbers and special characters.  Find out how many alphanumeric characters
		 * are in the String
		 */
		
		String random="klajflkj892039ur3@389#khaf)(&*^";
		
		System.out.println(random.replaceAll("[^A-Za-z09]","").length());
		//This says to replace all but NOT alphanumeric.  SO only special characters are replaced with nothing
		//the .length then says the length of what is remaining: 18
		
		

	}

}
