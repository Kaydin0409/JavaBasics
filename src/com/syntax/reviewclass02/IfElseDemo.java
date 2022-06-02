package com.syntax.reviewclass02;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=10;
		
		if(num>5) {
			System.out.println("Number is greater than 5");
		}
		if(false) {
			System.out.println("True"); 
		}
		
		 //since statement is false it will not run this line.  
		//Only time the code inside the if part is executed is if boolean is true or the expression results in true
		
		double balance=5000000;
		double amountToTransfer=50;
		
		if(balance>=amountToTransfer) {
			System.out.println("Go enjoy your life!");
		}else {
			System.out.println("I don't have enough money");
		}
	

	}

}
