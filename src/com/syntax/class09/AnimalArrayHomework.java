package com.syntax.class09;

public class AnimalArrayHomework {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 5 elements into it.
		 * Using 2 different loops print all elements from the array.
		 */
		
		String[] animals= {"Tiger", "Penguin", "Elephant", "Llama", "Lion"};
		
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		int k=0;
		do {
			System.out.print(animals[k]+" ");
			k++;
		}while(k<animals.length);
		

	}

}
