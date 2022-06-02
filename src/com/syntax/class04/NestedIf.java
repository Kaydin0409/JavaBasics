package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {
			System.out.println("Let me check how many doses you have");

			if (dose == 1) {
				System.out.println("You need 1 more dose");
			} else {
				System.out.println("You are fully vaccinated");
			}
		}

		

		String month = "June";
		int day = 8;

		if (month.equals("May")) {
			System.out.println("Let me check what is today's date");

			if (day == 8) {
				System.out.println("Today is Mother's Day!");
			}

		} else if (month.equals("June")) {
			System.out.println("Let me see if it is Father's day today");
			
			if (day==19) {
				System.out.println("Today is Father's day!");
			}

		}

	}
}
