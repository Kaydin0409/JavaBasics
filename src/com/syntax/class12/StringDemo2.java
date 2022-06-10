package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="Adem";
		String lastName=" Jones";
		String fullName=firstName+lastName; //ALWAYS prefer this
		String fullName2=firstName.concat(lastName);  //never use this because it can lead you to nullpointer exception

		System.out.println(fullName);
		System.out.println(fullName2);
		
		String name="";
		System.out.println(name.isEmpty()); //true
		
		
		String str="  never will  ";
		System.out.println(str.trim());  //removes spaces before and after
	}

}
