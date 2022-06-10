package com.syntax.reviewclass05;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum5 = 0;
		for (int i = 0; i <a.length; i++) {
		         if (a[i] % 2== a2[i ] % 5)  {
		                  sum5 += i * i;
		         }
		}
		System.out.println("sum = " + sum5);

		int count = 0;
		while (count++ < 10) {
		System.out.println("Welcome to Java");
		}
		
		int y = 0;
		for (int i = 0; i < 10; ++i) {
		y += 1;
		}
	     System.out.println(y);
		
	     int k=3, tot=0;

	     do{

	        tot=tot+k;

	        k++;

	     } while(k<11);

	     System.out.print(tot);
	     
	     
	     int z=2, sum=0;

	     while(z<9) {

	        z++;

	        sum=sum+z;

	     }

	     System.out.print(sum);
	     
	     System.out.println();
	     
	     int m=2, total=0;

	     while(m<6) {

	        total=total+m;

	        m++;

	     }

	     System.out.print(total);

	}
}


