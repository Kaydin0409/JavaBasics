package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String str="Where is sameer?";  //3=r 14=r
				System.out.println(str.charAt(3));
				System.out.println(str.charAt(5));
				System.out.println(str.indexOf("i"));
				System.out.println(str.indexOf("e"));
				
				System.out.println(str.indexOf("r",5));
				
				int counter=0;
				for(int i=0; i<str.length();i++) {
					
					if(str.charAt(i)=='e') {  //shows indexes of e
						counter++;  //counts each e index
						if(counter==4) {
							System.out.println(i); //shows index of 4th e
						}
					}
				}
				
	}

}
