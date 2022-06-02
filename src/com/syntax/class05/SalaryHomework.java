package com.syntax.class05;

import java.util.Scanner;

public class SalaryHomework {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of years you have worked");
		int years = scanner.nextInt();

		if (years >= 5) {
			System.out.println("You are eligible for the bonus");
			
			System.out.println("Enter your annual salary");
			int salary = scanner.nextInt();
			
			if (salary >= 50000) {
				System.out.println("You get a bonus of 5000");
			} else {
				System.out.println("You get a bonus of 3000");
			}
		} else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}
