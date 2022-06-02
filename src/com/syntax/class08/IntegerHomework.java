package com.syntax.class08;

import java.util.Scanner;

public final class IntegerHomework {

	public static void main(String[] args) {
		/* Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range
		 *   prints the sum of the even and odd integers.
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Provide a starting number, please.");
		int start=scanner.nextInt();
		
		System.out.println("Provide an ending number, please.");
		int end=scanner.nextInt();
		
		int sumeven=0;
		int sumodd=0;
		
		
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				sumeven+=i;
				
			}
			if(i%2!=0){
				sumodd+=i;
			}
		}
		System.out.println("The sum of the even numbers from "+start+" to "+end+" is "+sumeven);
		System.out.println("The sum of the odd numbers from "+start+" to "+end+" is "+sumodd);
			
			
		
		
		
		
		
scanner.close();
	}

}
