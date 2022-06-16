package com.syntax.class14;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("haahhaha");
		
		System.out.println(s.toUpperCase());
		StringBuilder st=new StringBuilder("jajajja");
		System.out.println(st.reverse()); //now String st has been changed to ajjajaj (reassigned value)
		System.out.println(st);
		

	}

}

