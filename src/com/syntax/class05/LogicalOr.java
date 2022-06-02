package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day="Saturday";
		
		if(day.equals("Monday")||day.equals("Friday")) {
			System.out.println("I have no class");
		}else if(day.equals("Tuesday")||day.equals("Wednesday")) {
			System.out.println("I have Manual Testing Class");
		}else if(day.equals("Thursday")) {
			System.out.println("I have Review Class");
		}else if(day.equals("Saturday")||day.equals("Sunday")) {
			System.out.println("I have Java Class");
		}
			

	}

}
