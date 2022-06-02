package com.syntax.reviewclass04;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		int num=0;
		
		while(num!=10) {
			System.out.println("enter a number");
			num=scanner.nextInt();
			System.out.println(num+2);
		}
		
		scanner.close();

	}

}
