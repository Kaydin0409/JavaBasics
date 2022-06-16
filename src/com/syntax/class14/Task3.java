package com.syntax.class14;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * You have a string a="Is it Saturday? Is it raining? Do we have a Java Class today?"
		 * HOw would you find out how many sentences are in that string?
		 */

		
		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
	
		System.out.println(a.split("[?]").length);
		//sentence is split based on ?.  This creates an array []. Each array has 1 sentence.
		//.length shows length of array: 3
		//if there is more punctuation simply put "[!.?]"
		
		
	}

}
