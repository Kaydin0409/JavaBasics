package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Batch 13 is Great";
		System.out.println(str.startsWith("Batch")); //true or false: true
		System.out.println(str.startsWith("Frozen")); //false
		
		//use the true or false methods within if conditions for example
		
		System.out.println(str.endsWith("t")); //true
		System.out.println(str.endsWith("great")); //false
		System.out.println(str.toLowerCase().endsWith("great")); //true

		
		String name="HAMID";
		System.out.println(name.toLowerCase()); //hamid.  methods do not change the value of String variables
		System.out.println(name); //HAMID
		
		System.out.println(str.contains("13")); //true
		System.out.println(str.toLowerCase().contains("batch")); //true
		
		

	}

}
