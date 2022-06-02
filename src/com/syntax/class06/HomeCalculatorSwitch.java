package com.syntax.class06;

import java.util.Scanner;

public class HomeCalculatorSwitch {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		double num1=scanner.nextDouble();
		double num2=scanner.nextDouble();
		double result=0; //use =0 so if default result will still have an assigned value
		
		System.out.println("Please enter an operator");
		char op=scanner.next().charAt(0);
		
		String operator=null; //use =null so if answer =0 but is actually not the default result it will still print out the correct result
		
		switch(op) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1+num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case'/':
			result=num1/num2;
			break;
		default:
			System.out.println("Invalid Operator");
			operator="Invalid";
		}
		
		if(result!=0 || operator==null) {
			System.out.println(result);}
		
		scanner.close();

	}

}
