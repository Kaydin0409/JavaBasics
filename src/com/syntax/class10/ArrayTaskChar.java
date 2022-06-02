package com.syntax.class10;

public class ArrayTaskChar {

	public static void main(String[] args) {
		// Create an array to store char values and then print those in reverse order
		
		char[] values= {'M','F','T','F'};
		
		for(int i=(values.length-1); i>=0; i--) {
			System.out.println(values[i]);
		}
		
		

	}

}
