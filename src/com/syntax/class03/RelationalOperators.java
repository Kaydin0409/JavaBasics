package com.syntax.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		//<,>,<=,>=,==,!=.  Relational operators is a boolean value
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2);  //false
		System.out.println(num1<num2);  //true
		System.out.println(num1!=num2); //true
		System.out.println(num1==num2); //false.  asking if they are equal? Relational
		
		System.out.println(num1=num2); //22.  this is reassigning the value of num1.  Assignment
		System.out.println(num1==num2); //true.  num1 was reassigned to 22 so they are equal now
		
		boolean result=100>200;  //relational operator
		System.out.println(result);
		
		int result1=100+200; //arithmetic operator
		System.out.println(result1);
		
		String result2="Emre"+10; //concatenation operator
		System.out.println(result2);
		
		int num3=10;
		int num4=11;
		
		result=num3==num4; //result=false because num3 does not equal num4
				           //Reassigning result to false
		System.out.println(result);
		
		result=num3!=num4;
		System.out.println(result); //true.  num3 does not equal num4. now result=true
		
		
	
		
		
		
	}

}
