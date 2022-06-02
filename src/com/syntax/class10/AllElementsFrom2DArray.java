package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String[][] usa= {
				
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"},
				
		};
				
				//outer loop iterates over rows
				
				for(int row=0; row<usa.length; row++) {
					
					for(int column=0; column<usa[row].length; column++) {
						System.out.println(usa[row][column]);
					}
					
				}

	}

}
