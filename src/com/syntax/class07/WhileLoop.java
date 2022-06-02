package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int time=10;
		
		while(time<12) {
			System.out.println("Morning");
			time++; //will run morning twice: 10 and 11
		}
		
		
		//print numbers from 1 to 10;
		
		int num=1;
		
		while(num<=10) {
			System.out.println(num);   //System.out.print(num) will print all numbers in 1 line.  System.out.print(num+" ") will give space after each number.
			num++;
		}
		
		while(num<=10) {
			num++;
			System.out.println(num);  //starts at 2 and gives 11 because addition of 1 is executed before syso.  put increment num++ after syso
			
		}
		
		//print numbers from 10 to 1
		
		int b=10;
		
		while (b>=1) {
			System.out.println(b);
			b--;
		}
		
		
		//print 100 to 50
		
		int c=100;
		
		while (c>=50) {
			System.out.print(c+" ");
			c--;}
		
		//print even numbers 2 to 20
		
		int d=0;
		
		while(d<=20) {
			System.out.print(d+" ");
			d+=2;
		}
		//OR print even numbers by:
		
		int e=1;
		while (e<=20) {
			
			if (e%2==0) {
			System.out.println(e);
			}
			e++;
			}
		
		
			
			
		
		
		
		
		
	}

}
