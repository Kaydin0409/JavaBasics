package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {

		/*
		 * Ask user "Did you get a job? AND we will continuously ask if you got a job
		 * until you say yes if you say yes, we will say congratulations
		 */

		Scanner scanner = new Scanner(System.in);

		String job;

		do {
			System.out.println("Did you get a job?");
			job = scanner.nextLine();
			
		} while (!job.equalsIgnoreCase("yes"));
			System.out.println("Congratulations!");

			
			//while example
			
			String offer;
			System.out.println("Did you get a job?");
			offer=scanner.nextLine();
			
			while(!offer.equalsIgnoreCase("yes")) {
				System.out.println("did you get a job?");
				offer=scanner.nextLine();
			}
			System.out.println("Congratulations!");
			
			
		

			    			  
			    			 
			}
			
	}

