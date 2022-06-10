package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str="Asghar is funny";
		System.out.println(str.charAt(2)); //g
		System.out.println(str.charAt(5)); //r
		
		int counter=0;
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<str.length(); i++) {
			if('s'==str.charAt(i)) {
				counter++;
			}
		}
		
		System.out.println("S appeared "+counter+" times in the string");
	
		
		String str2="1234574861425411";
		
		int counter2=0;
		
		for(int i=0; i<str2.length(); i++) {
			if(str2.charAt(i)=='1') {
				counter2++;
			}
		}
		System.out.println("1 appears "+counter2+" times in the string");
		
		

	}

}
