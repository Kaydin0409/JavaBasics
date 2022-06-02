package com.syntax.class03;

public class PrimitivesCasting {
	
	public static void main(String[] args) {
		
		int i=100;
		double d=100;
		
		System.out.println(i); //100
		System.out.println(d); //100.0
		
		//integer value is converted into double type of value. *Widening*
		//java implicitly or automatically added the .0 to double value
		
		//long l=10000L;
		//byte b=130;   TOO LARGE for byte. integer type of value
		
		//int x=100.99; type mismatch: cannot convert from double to int
		//java will not automatically or implicitly put larger value into smaller box
		//in order to do narrowing or explicit casting you must do the following:
		int x=(int)100.99;
		System.out.println(x); //100.  You lose information if you do narrowing (.99 lost)
		
		byte b=(byte)130; //narrowing
		System.out.println(b); //-126.  Very weird process due to binary code (0's and 1's)
		//don't worry about this particular process. we will not use in coding but it exists

		
		long a=(long)500.4444;
	    System.out.println(a);
	    
		
		
		
		
	}
		
		
		
		
	}


