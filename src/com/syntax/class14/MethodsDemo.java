package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {
	/*
	 * Method is a block of code, a group of java statements that are grouped together.
	 * We can execute those statements by just creating an object of the class that contains
	 * that method and by writing the objectsName.methodName.
	 */
	
	void printHello() {
		System.out.println("How are you guys");
	}
	
	boolean returnTrue() {
		return true;
	}

	int returnInt() {
		return 10;
	}
	public static void main(String[] args) {
		
		MethodsDemo md=new MethodsDemo();
		
		md.printHello();
		
		boolean xs=md.returnTrue();
		
		int num=md.returnInt();
		System.out.println(num);  //or simply do System.out.println(md.returnInt());
		
		
		Scanner scanner=new Scanner (System.in);
		scanner.nextInt();
		
		
		
	}

}
