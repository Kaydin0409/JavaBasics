package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Oleg";
		
		String lastName="Smith";
		
		long phone=4237477753L;
		
		//what if I want phone number xxx-xxx-xxxx?
		
		String phoneNumber="423-747-7753";
		
		String address="140 Bentley Parc";
		
		int age=30;
		
		String city="Miami";
		
		//Shortcut for printing
		//type syso +ctrl + space and then hit enter
		
		
		/*
		 * When we want to attach String to String we can use + to attach
		 * (+ Works as Concatenation Operator)
		 * If I want to add space simply attach " " with +
		 * Use + to attach String to any other data type (example to int)
		 */
		System.out.println(name+" "+lastName);//Oleg Smith
		
		System.out.println(name+" lives in "+city);//Oleg lives in Miami
		
		System.out.println(name+" is "+age+" years old");//Oleg is 30 years old
		
		
		
		

			 
		
		
				
		
	}

}
