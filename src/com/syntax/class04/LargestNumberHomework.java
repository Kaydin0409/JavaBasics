package com.syntax.class04;

import java.util.Scanner;

public class LargestNumberHomework {

	public static void main(String[] args) {
		
		int a=91;
		int b=108;
		int c=110;
		
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is the largest number");
			}else {
				System.out.println(c+" is the largest number");}
		}else { //otherwise b>a
				if(b>c) {
					System.out.println(b+" is the largest number");
			}	else //b>c
				{
				System.out.println(c+" is the largest number");
				}
			}
		
		
		 Scanner scanner=new Scanner(System.in);

		    System.out.println("Please enter 3 distinct numbers");
		    int num1=scanner.nextInt();
		    int num2=scanner.nextInt();
		    int num3=scanner.nextInt();
		    String newLine=scanner.nextLine();

		    if(num1>num2){
		      if(num1>num3){
		      System.out.println("The largest number is "+num1);}
		    }else if(num2>num1){
		      if(num2>num3){
		      System.out.println("The largest number is "+num2);}
		    }else{
		        System.out.println("The largest number is "+num3);}

	}

}
