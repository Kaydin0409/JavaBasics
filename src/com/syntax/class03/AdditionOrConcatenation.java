package com.syntax.class03;

public class AdditionOrConcatenation {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String c="Hello";
		String d="Hi";
		
		System.out.println(a+b+c+d); //30HelloHi
		System.out.println(a+c+b+d); //	10Hello20Hi
		System.out.println(c+d+a+b); //HelloHi1020
									/*
									 *  Why?? + sign b/w 2 strings is concatenation
									 *  Java goes left to right. HelloHi is string
									    adding new string+int is still making it
									    concatenation operator
									 */
		
		System.out.println(c+d+(a+b)); //HelloHi30 due to parentheses
		
								
		boolean boo=true;
		System.out.println(c+boo);
		
		
		
		
		
		
	}
	
	
	

}
