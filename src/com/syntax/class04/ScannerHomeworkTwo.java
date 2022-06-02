package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomeworkTwo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is the largest number");
		}else {
			System.out.println(num2+" is the largest number");
		}

	}

}
