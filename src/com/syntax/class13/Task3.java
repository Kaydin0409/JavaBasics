package com.syntax.class13;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that reads two people's first
	names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
		 */

		String father="Daniel";
		String mother="Mary";
		boolean boy=false; //if true boy, otherwise girl
		
		if(boy) {
			String firstHalf=father.substring(0,father.length()/2);
			String secondHalf=mother.substring(mother.length()/2);
			System.out.println(firstHalf+secondHalf);
		}else {
			String secondHalf=father.substring(father.length()/2);
			String firstHalf=mother.substring(0,mother.length()/2);
			System.out.println(firstHalf+secondHalf);
		}
		
		String father2="Sameer";
		String mother2="Taylor swift";
		boolean boy2=false;  //if true boy otherwise girl
		
		if(boy2) {
			String firstHalf=father2.substring(0,father2.length()/2);
			String secondHalf=mother2.substring(mother2.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}else {
			String firstHalf=mother2.substring(0,mother2.length()/2);
			String secondHalf=father2.substring(father2.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}
		
		
		
	}

}
