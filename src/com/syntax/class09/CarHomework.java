package com.syntax.class09;

public class CarHomework {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		 */
		
		
		String[] cars= {"Subaru","Acura","BMW","Audi","Mercedes","Toyota"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		int k=0;
		
		while(k<cars.length) {
			System.out.print(cars[k]+" ");
			k++;
		}

	}

}
