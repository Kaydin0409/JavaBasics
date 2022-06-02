package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean job=true;
		double salary=100000;
		
		if(job&&salary>=100000) {
			System.out.println("I am super duper happy!");
		}
		
		boolean study=true;
		boolean homework=true;
		boolean practice=true;
		
		if(study&&homework&&practice) {
			System.out.println("You will succeed at this course!");
		}else {
			System.out.println("You will struggle");
		}

	}

}
