package com.syntax.class13;

public class StringDemo1 {
	
	
	public static void main(String[] args) {
		
		
		
		String str="Batch 13 is good";
		System.out.println(str.replace("good","Great"));
		System.out.println(str.replace("g","G"));
		
		String str2="ggggggg";
		
		System.out.println(str2.replaceAll("g", "a"));
		
		
		String crazy="kal;jflajfoiajfoisda!!#%$79287329KKJJUU";
		
		System.out.println(crazy.replaceAll("[0-9]", "#"));
		System.out.println(crazy.replaceAll("[a-z]", "#"));
		System.out.println(crazy.replaceAll("[A-Z]", "#"));
		System.out.println(crazy.replaceAll("[a-zA-Z]", "#"));
		System.out.println(crazy.replaceAll("[a-zA-Z0-9]", "#"));
		System.out.println(crazy.replaceAll("[^a-z]", "_"));  //replace EVERYTHING but not(^)a-z
		System.out.println(crazy.replaceAll("[^A-Z]", "*"));  //replace everything but A-Z
		System.out.println(crazy.replaceAll("[^A-z0-9]", "*")); //replace only special characters, rest stays.
		//Ascii table allows us to write only A-z
	
		
		str="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]", "*")); //replaces a to f with the *
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
