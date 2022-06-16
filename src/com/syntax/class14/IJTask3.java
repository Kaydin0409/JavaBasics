package com.syntax.class14;

public class IJTask3 {

		void palindromeOrNot(String str){
	        StringBuilder stringBuilder=new StringBuilder(str);
	        stringBuilder.reverse();
	        String reversedStr=stringBuilder.toString();
	        if(str.equals(reversedStr)){
	            System.out.println(str+" is palindrome.");
	        }else{
	            System.out.println(str+" is not a palindrome.");
	        }
	        }

	    public static void main(String[] args) {

	        IJTask3 task3=new IJTask3();

	        task3.palindromeOrNot("dad");



	}

}
