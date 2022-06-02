package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		// I need to print numbers from 1 to 90
		
		for(int i=1; i<=90; i++) {
			System.out.print(i+" ");
		}
		
		/*
		 * Specify start point
		 * end point
		 * increment/decrement
		 */
		
		System.out.println();

		
		//I need numbers from 60 to 10
		
		for(int j=60; j>=10; j--) {
			System.out.println(j);
		}
		
		//what is the output?
		
		for(int i=5; i<=40; i+=5) {
			System.out.print(i+" "); //5, 10, 15, 20, 25, 30, 35, 40
		}

		System.out.println();
		
		//print even numbers from 20 to 1
		
		for(int i=20; i>=1; i-=2) {
			System.out.println(i);
		}
		
		for(int i=20; i>=1; i--){
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//print odd numbers between 20 and 50
		
		for(int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		
		for(int i=21; i<=50; i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//print numbers from 1 to 100 in 1 line with space
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//print numbers from 100 to 1
		
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
	}

}
