package com.syntax.class09;

public class SumArrayHomework {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */
		
		int[] numbers= {8, 10, 82, 40, 22, 108};
		int sum=0;
		
		for(int values:numbers) {
			sum+=values;
		}
		System.out.println(sum);
		
		int sum2=0;
		
		
		for(int j=0; j<numbers.length; j++) {
			sum2+=numbers[j];
		}
		System.out.println(sum2);
	}

}
