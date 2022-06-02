package com.syntax.reviewclass02;

public class OperatorsDemo {

	public static void main(String[] args) {
		// Operators in Java-->Arithmetic Operators: +,-,/,*,%     Logical Operators: ==,!=,>=,<=,>,< (true or false/boolean)
		// Anything with equal sign is equality operators....... <,> is relational operators.  
		
		int num=10;
		int num2=10;
		
		System.out.println(num+num2);
		System.out.println(num>=num2); //since 1 thing is true, result is true
		
		//Whole Number: 0 to infinity
		System.out.println(Long.MIN_VALUE); //gives us mininum range of long
		System.out.println(Long.MAX_VALUE); //gives us maximum range of long
		
		System.out.println(10.0/3.0); //3.33333...
		System.out.println((int)10.0/3); // 3 
		System.out.println((int)10.5*3); //loss of information due to conversion to integer

	}

}
