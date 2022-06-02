package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		// ! Reverses the condition (opposite)

		boolean boo=!true;
		
		System.out.println(boo);

		boolean boo2=!false;
		System.out.println(boo2);
		
		/*
		 * If there is no traffic --> I will reach work on time
		 */
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will reach work on time");
		}
		
		
		String name="Emre";
		
		if(!name.equals("Emre")){
				System.out.println("You are not Emre");}
	}

}
