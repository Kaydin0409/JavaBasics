package com.syntax.class09;

public class DoubleArrayHomework {

	public static void main(String[] args) {
		/*
		 * Create an array to store double values and then print all elements using 2 different loops
		 */
		
		double[] num= {2.9, 4.89, 5.25, 14.26};
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		
		for(double value:num) {
			System.out.print(value+" ");
		}

	}

}
