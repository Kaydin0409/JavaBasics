package com.syntax.class14;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I never forget about recording";
		System.out.println(str.replace("never","always").replace("I","Asghar")); //Asghar always forget about recording
		
	
		String random="kanjaklakj198397269!@*(#";
		System.out.println(str.replaceAll("[0-9]","")); //removes all numbers replace with nothing
				
				
		String str2="Batch 13 is Great. Batch 13 is Best. Batch 13 is Excellent";
		String[] arr=str2.split("[.]");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		/*
		 * Batch 13 is Great
		 * Batch 13 is Best
		 * Batch 13 is Excellent
		 */
		str2="We #love# Java";
		String[] arr2=str2.split("[#]");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		/*
		 * We
		 * love
		 *  Java
		 */
		
		

	}

}