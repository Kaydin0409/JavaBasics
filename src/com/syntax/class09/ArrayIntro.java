package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		
		
		//Create an array
		int[] b=new int[4];
		
		//store values/elements
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		//access values from my array
		System.out.println(b[2]); //70
		
		System.out.println(b[1]+b[3]); //185

		
		//We need to create an array of my classmates
		
		String[] classmates=new String[5];
		
		classmates[0]="Khrystyna";
		classmates[1]="Zameer";
		classmates[2]="Elexia";
		classmates[3]="Oleg";
		classmates[4]="Adem";          //ctrl+space outer completes longer variables.  clas ctrl+space fills in classmates[]
		
		
		System.out.println("My classmate's name is "+classmates[3]); //Oleg
		
		
		
		
		
		
		
		
		
	}

}
