package com.syntax.class14;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * How would you reverse a String word by word?
		 * for example: input: This is sentence I want to reverse
		 * output: sihT si ...
		 */
		
		String sen="This is sentence I want to reverse";
		
		String[] arr=sen.split(" "); //sentence is split up based on space
		
		for(String s:arr) {
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		//you cannot use just reverse because it would reverse the position of words also
		//This from String sen is placed in array[0], is placed in array[1], etc.
		//Next each array goes through advanced for loop and string builder reverses each index
	}

}
