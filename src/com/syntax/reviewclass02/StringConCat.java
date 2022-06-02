package com.syntax.reviewclass02;

public class StringConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Ali";
		String lastName="Baba";
		String fullName=firstName+lastName;
		int num=10;
		int num2=10;
		System.out.println(fullName);
		System.out.println(firstName+num);
		System.out.println(firstName+num+num2);
		//Ali1010 due to beginning is a String so left to right first operation is String concatenation with integer variable and creates new String variable
		System.out.println(firstName+(num+num2)); //Ali20
		System.out.println(num+firstName+num2); //10Ali10
		System.out.println(num+num2+lastName); //20Baba because left to right arithmetic operator is first followed by the string.
		
		
		
		
	}

}
