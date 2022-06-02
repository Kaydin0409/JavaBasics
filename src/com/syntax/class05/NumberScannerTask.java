package com.syntax.class05;

import java.util.Scanner;

public class NumberScannerTask {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 1000");
		int number=input.nextInt();
		
		if (number>=1&&number<=10) {
			System.out.println("This is a small number");
		}else if (number>=11&&number<=100) {
			System.out.println("This is a medium number");
		}else if (number>=101&&number<=1000) {
			System.out.println("This is a large number");
		}

	}

}
