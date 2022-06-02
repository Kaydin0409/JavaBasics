package com.syntax.reviewclass02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scanner.nextInt();                      //nextInt cannot handle the enter key, therefore the nextLine must be added.  Integer does not store enter in the buffer
														//Enter is the same as nextLine
		
		String newLine=scanner.nextLine();
		
		System.out.println("Please Enter Your Name");
		String name=scanner.nextLine();
		
		
		
		System.out.println(age+name);
		
		
	}

}
