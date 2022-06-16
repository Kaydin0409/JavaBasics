package com.syntax.class14;


public class MethodsDemo3 {
	

	boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean stIsEven(String str) {
		if(str.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo3 evenOrOdd=new MethodsDemo3();
		System.out.println(evenOrOdd.isEven(4)); //true
		
		System.out.println(evenOrOdd.stIsEven("I love using my brain")); //21 characters in length so false

	}

}
