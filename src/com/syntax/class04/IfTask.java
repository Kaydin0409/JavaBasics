package com.syntax.class04;

public class IfTask {

	public static void main(String[] args) {
		// Write a program to check if number is positive or negative
		
		int num1=8;
		
		if (num1<0) {
			System.out.println(num1+" is negative");
		}else if (num1==0){
			System.out.println(num1+" is neither negative nor positive");
		}else {
			System.out.println(num1+" is positive");
		}

	}

}
