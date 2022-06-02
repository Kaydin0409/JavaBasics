package com.syntax.class08;

import java.util.Scanner;

public class LoopsPractice {

	public static void main(String[] args) {
		
		
		int sum=0;
				
		for(int i=1; i<6; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		/*
		 * sum=sum+i
		 * sum=0+1
		 * sum=1+2
		 * sum=3+3
		 * sum=6+4
		 * sum=10+5
		 * for loop stops since 6 is not less than 6
		 * syso is 15
		 * Nothing prints out until after loop is complete since syso is outside of {}
		 * IF syso was inside {} then it will print out ALL the sum results 1, 3, 6, 10, 15
		 */
		
		//write a program to find sum of all even and all odd numbers from 1 to 70
		
		int sum1=0;
		
		for(int i=2; i<=70; i+=2) {
			sum1+=i;
		}
		System.out.println(sum1);
		
		int sum2=0;
		
		for(int i=1; i<=70; i+=2) {
			sum2+=i;
		}
		System.out.println(sum2);
		
		//here is better way:
		
		for(int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		
		for(int i=21; i<=50; i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
		/*
		 * declare a secret number;
		 * 
		 * ask user to guess your secret number
		 * 
		 * your code should keep asking to guess until user gets your secret number
		 */
		
		System.out.println();
		
		Scanner scanner=new Scanner(System.in);
		
		int secret=8;
		int guess;
		
		do {
			System.out.println("Guess my secret number!");
			guess=scanner.nextInt();
		}while(secret!=guess);
			
			System.out.println("you got it!");
			
			
			
			
			
			
		
		scanner.close();
		
	}

}
