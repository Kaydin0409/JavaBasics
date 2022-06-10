package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=new String("Oleg"); //proper way of creating an object from a class.
		
		String name2="Oleg"; //this is mostly the same, just a shortcut by leaving out =new String()
		//All the classes in java can be treated as data types.  You can create any data type YOU want.
		//more than just 8 data types since you can create your own...could be referred to as class or data type.
		
		//if a class is present inside the same package OR if a class belongs to java.lan package
		name.length();  //this is a behavior related to String class.
		System.out.println(name.length());  //counts characters that are present inside variable //4 in "Oleg"
		
		name2="Zameer";
		System.out.println(name2.length()); //6 characters.  Everything in "" is counted. spaces, EVERYTHING
		
		
		String captain="NAVEED";
		System.out.println(captain.toLowerCase());
		captain="I love Java";
		System.out.println(captain.toUpperCase());
		
		
		
		
		
		
		
		
		
		

	}

}
