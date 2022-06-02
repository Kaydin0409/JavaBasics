package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		// print 1 to 30
		
		int num=1;
		
		do {
			System.out.print(num+" ");
			num++;
		}while(num<=30);
		
		
		System.out.println();
		
		//print 70 to 30 only even
		
		int num2=70;
		do{
			System.out.print(num2+" ");
			num2-=2;
		}while (num2>=30);
	}

}
