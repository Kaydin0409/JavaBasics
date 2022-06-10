package com.syntax.reviewclass05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {


		String [] names=new String[5];
		
		Scanner input=new Scanner(System.in);
		
		for(int i=0; i<names.length; i++) {
			names[i]=input.next();
		}
		
		System.out.println(Arrays.toString(names));

	}

}
