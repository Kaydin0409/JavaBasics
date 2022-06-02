package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		
		int age=18;
		int weight=108;
		
		if(age>=18) {
			System.out.println("You are old enough to donate blood");
			System.out.println("Now let me check your weight");
			if(weight>110){
				System.out.println("You are eligible to donate blood");
			}
			else {
				System.out.println("You do not weigh enough to donate blood");
			}
		}else {
			System.out.println("We cannot accept you as a patient");
		}

	}

}
