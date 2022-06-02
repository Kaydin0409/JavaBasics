package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String[] disney= {"Shrek", "Elsa", "Goofy", "Mulan", "Aladdin"};
		
		System.out.println(disney[1]); //Elsa
		
		//how to get all elements from an array
		
		for(int i=0; i<disney.length; i++ ) {
			System.out.println(disney[i]);
		}
		
		
		for(String character:disney) {
			System.out.print(character+" ");
		}
		

		System.out.println("-------");
		
		for(String character:disney) {
			
			if(character.equalsIgnoreCase("Aladdin")) {
				System.out.println(character+" is my favorite character!");
			}else {
			System.out.println(character);
			}
		}
		
			for(String character:disney) {
			
			if(character.equalsIgnoreCase("Aladdin")) {
				continue;                        //continue placed here means Aladdin is skipped(not printed)
			}else {
			System.out.println(character);}
			}
			
			for(int i=0; i<disney.length; i++ ) {
				if (disney[i].equalsIgnoreCase("Shrek")) {
					System.out.println(disney[i]+" is my favorite character");
				}else {
				System.out.println(disney[i]);
				}
			}
		
		
		

	}

}
