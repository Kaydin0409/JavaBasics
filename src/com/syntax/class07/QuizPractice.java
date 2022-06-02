package com.syntax.class07;

public class QuizPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if( 1 > 2 ) {
	           System.out.println(" 1 is greater than 2");
	} else {
	           System.out.println(" 2 is greater than 1");}
	           
	          int day = 7;

	           switch(day) {
	           case 1:
	           System.out.println("Monday");
	           case 2:
	           System.out.println("Tuesday");
	           case 3:
	           System.out.println("Wednesday");
	           case 4:
	           System.out.println("Thursday");
	           case 5:
	           System.out.println("Friday");
	           }
	
		
		
		
		
		boolean male = false;
		int age = 30;

		if( male ){
		     if( age < 20 ){
		         System.out.println("Boy");
		     } else {
		         System.out.println("Man");

		    }
		}else {

		      if( age < 20 ){
		          System.out.println("Girl");
		       }else  {
		          System.out.println("Woman");
		      }}
		      
		      
		     

		    		  float f = 75.0f;
		    		  double d = 75.0;
		    		  int i = 75;

		    		  if( f == d ) {
		    		     if( f == i ) {
		    		        System.out.println("f, d and i are equal");
		    		      } else {
		    		        System.out.println("f, d are equal but i is not equal");
		    		      }

		    		  } else {
		    		      System.out.println("f and d are not equal");
		    		  }
		    		  
		    		  
		    		  
		    		  boolean a, b, c;
		    		     a = b = c = true;

		    		          if( !a || ( b && c ) ) {
		    		             System.out.println("If executed");
		    		          } else {
		    		             System.out.println("else executed");
		    		          }

	
		    		          boolean x = true;
		    		          boolean y = false;
		    		          if (x || y) {
		    		               System.out.println(true);
		    		          } else {
		    		               System.out.println(false);
		    		          }
		    		          
		    		          float fl = 5.3f;
		    		          if (fl == 5.3) {
		    		             System.out.println("Both are equal");
		    		          } else {
		    		             System.out.println("Both are not equal");
		    		          }
	}
	
}
