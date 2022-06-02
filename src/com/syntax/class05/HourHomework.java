package com.syntax.class05;

import java.util.Scanner;

public class HourHomework {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the hour in 24 hour format");
		int hour=scanner.nextInt();
		
		if(hour>=1&hour<=11) {
			System.out.println("It is morning");
		}else if (hour>=12&hour<=15) {
			System.out.println("It is afternoon");
		}else if(hour>=16&hour<=20) {
			System.out.println("It is evening");
		}else if(hour>=21&hour<=24) {
			System.out.println("It is night");
		}else {
			System.out.println("Invalid time entered");
		}

	}

}
