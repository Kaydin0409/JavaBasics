package com.syntax.reviewclass03;

public class IfElse2 {

	public static void main(String[] args) {
		//

		//String day=null; //in non-primitive type variables we can store null which means nothing //empty
		
		String day="Monday";
		if(day.equals("Monday")) {
			System.out.println("weekday");
		}
		
		if("Tuesday".equals(day)) {
			System.out.println("weekday");
		}
		
		if("Wednesday".equals(day)) {
			System.out.println("weekday");
		}
		if("Thursday".equals(day)) {
			System.out.println("weekday");
		}
		if("Friday".equals(day)) {
			System.out.println("weekday");
		}
		
		if("Saturday".equals(day)) {
			System.out.println("Weekend");
		}
		
		if("Sunday".equals(day)) {
			System.out.println("Weekend");
		}
			
		//Can improve the code by using logical operators
		
		//if(day.equals("Monday")||"Tuesday".equals(day)||"Wednesday".equals(day)||"Thursday".equals(day)||"Friday".equals(day)) {
			System.out.println("Weekday");
		

	}

}
