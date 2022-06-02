package com.syntax.class09;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		
		String[] fruits= {"mango", "apple", "kiwi", "pear"};
		
		System.out.println(fruits[2]); //kiwi
		
		
		
		
		//I want to find size of an array. How many elements?
		
		int size=fruits.length;
		System.out.println(size);
		
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grades[1]);
		
		char[] grades2=new char[6];
		
		grades2[0]='A';
		grades2[1]='B';
		grades2[2]='C';
		grades2[3]='D';
		grades2[4]='E';
		grades2[5]='F';
		
		System.out.println(grades2[1]);
		
		for(int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+" ");
			
		}
		
		/*
		 * 2. Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		String[] days= {"Java", "Saturday", "day", "coding", "is"};
		
		System.out.println(days[1]+" "+days[4]+" "+days[0]+" "+days[3]+" "+days[2]);


		

	}

}
