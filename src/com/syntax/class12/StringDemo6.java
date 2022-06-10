package com.syntax.class12;

public class StringDemo6 {

	public static void main(String[] args) {


		String str="I am always confused";
		
		System.out.println(str.indexOf('c')); //12
		System.out.println(str.indexOf('a')); //goes to first 'a'
		System.out.println(str.indexOf("always")); //5 because always begins at index 5
		
		
		//write code to show index of all the 'a' characters
		
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(i)=='a') {
				
			}
		}
		
		String str2="Java is Easy";
		
		String str3=str.substring(0,4);
		System.out.println(str3);
		System.out.println(str2.substring(8,12));

	}

}
