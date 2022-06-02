package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		/*
		 * switch can work with byte, short, int, char, String
		 * 
		 * switch has datatype limitations
		 * 
		 * switch cannot work with double, float, long, boolean
		 */
		
		double price=10;
		
		/*switch(price) //Compiler error(CE): Cannot switch on a value of type double.
		 * 
		 */
		
		/*
		 * switch has operator limitations:
		 * cannot use logical operators inside switch (&&,||,!)
		 * cannot use relational operators (>,<,etc.)
		 * 
		 */
		
		/* EXAMPLE: logical operator not working
		 * char choice='Y';
		 * String meaning;
		 * switch(choice) {
		
			case 'Y'||'y': //CE: cannot use logical operator
			   meaning="Yes";
			   break;
		 */
		
		/*
		 * switch case checks for EQUALITY.  switch is VALUE BASED
		 */
		
		
		
		
		

	}

}
