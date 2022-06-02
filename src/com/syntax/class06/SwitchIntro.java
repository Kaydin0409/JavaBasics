package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		/*
		 * switch(variable){
		 * case value1:
		 * code a;
		 * break;
		 * 
		 * case value2:
		 * code b;
		 * break;
		 * 
		 * code value3:
		 * code c;
		 * break;
		 * }
		 */

		int day=7;
		String name;
		
		if (day==1) {
			name="Monday";
		}else if (day==2) {
			name="Tuesday";
		}else if (day==3) {
			name="Wednesday";
		}else if (day==4) {
			name="Thursday";
		}else if (day==5) {
			name="Friday";
		}else if (day==6) {
			name="Saturday";
		}else if (day==7) {
			name="Sunday";
		}else { // else is always last block if you choose to add one.
			name="Invalid";
		}
		
		System.out.println(name);
		
		switch(day) {
		
		case 1:
			name="Monday";
			break; //breaks are needed because if it is not there java will jump onto the next case until it finally reaches a break or }
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7:
			name="Sunday";
			break;
		default: //unlike else, default can be placed anywhere in a switch statement because it is a value BUT usually default is seen as last keyword
			name="Invalid";
			break; //this break is not needed because last } is showing end of code and for java to exit
		}
		
		System.out.println(name);
		
		
		
	}

}
