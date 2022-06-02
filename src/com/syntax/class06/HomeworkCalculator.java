package com.syntax.class06;

import java.util.Scanner;

public class HomeworkCalculator {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator.  Allow user to enter 2 numbers and operator(+,-,*,/)
		 * Based on operator provide the result to user.  Please complete assignment in 2 ways
		 * using if statement and switch case
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		double num1=scanner.nextDouble();
		double num2=scanner.nextDouble();
		double result;
		
		System.out.println("Please enter an operator");
		char op=scanner.next().charAt(0);
		
		if(op=='+') {
			result=num1+num2;
		}else if(op=='-') {
			result=num1-num2;
		}else if(op=='*') {
			result=num1*num2;
		}else{
			result=num1/num2;
		}
		System.out.println("The result of "+num1+op+num2+" equals "+result);
		
		
		
		
		
		
		
	}

}
