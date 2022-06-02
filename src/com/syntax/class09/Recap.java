package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	//	for(int i=1; i<=5; i++) {
			
		//	continue;
		//	System.out.println("Hello"); //unreachable code due to continue stopping code
			
		//	break;
			
			//NOT Valid scenario. just for example.  
		// this example loop will run 5 times but no code will be executed
		
		
		//for(int i=1; i<=5; i++){
		
		//	break;
		//	System.out.println("Hello");}
		
		//will only run 1 time because break stops loop
			
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			for(int y=1; y<=3; y++){
				System.out.println("Bye");

			} 
			//Hello, Bye bye bye x 5
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			for(int y=1; y<=3; y++){
				System.out.println("Bye");
		}
			break;  //Hello, bye bye bye and then break
		}
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			for(int y=1; y<=3; y++){
				System.out.println("Bye");
				break;   //Hello Bye x 5; y breaks after 1
		}
			
		}
		
	/*	for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			for(int y=1; y<=3; y++){
				continue;
			*	System.out.println("Bye");  //unable to execute code "bye".  continues to inner loop 3 times but unable to execute.
			*                               // then after 3 times it will return to outer loop
			*/
			
		}
			
		

	}

