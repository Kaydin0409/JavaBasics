package com.syntax.class07;

public class WhileLoopTask {

	public static void main(String[] args) {
		// even numbers 20 to 100
		
		int a=20;
		
		while (a<=100) {
			System.out.print(a+" ");
			a+=2;
		}
		
		System.out.println();
		
		//odd numbers 100 to 1
		
		int b=99;
		
		while (b>=1) {
			System.out.print(b+" ");
			b-=2;
		}
		
		System.out.println();
		//OR
		
		int c=100;
		
		while (c>=1) {
			
			if(c%2!=0) {
				System.out.print(c+" ");
			}
			c--;
		}
		
		
		int num=1;
		
		do {
			System.out.print(num+" ");
			num++;
		}while(num<=30);

	}

}
