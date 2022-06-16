package com.syntax.class14;

public class MethodsDemo2 {

	void batch13Print() {
		for(int i=0; i<5; i++) {
			System.out.println("Batch13 is Great!");
		}
		}
	
	void printManyTimes(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Batch13 is Great!");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodsDemo2 md=new MethodsDemo2(); //creating the object of a class
		md.batch13Print();
		
		System.out.println("======");
		
		md.printManyTimes(3);  //now prints 3 times "Batch13 is Great!"
	}

}
