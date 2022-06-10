package com.syntax.class11;

public class Dog {
	
	//OBJECT ORIENTED PROGRAMMING
	
	/*
	 * The class is like a blueprint that shows 
	 * what the object will look
	 * 	like (attributes and what are it's behaviors
	 */
	
	 //The below are defining what the dog LOOKS LIKE (Attributes)
	String name;
	int age;
	double weight;
	String color;
	double height;
	String breed;
	
	//Methods define a BEHAVIOR (how the object behaves)
	void bark() {
		System.out.println("Dog Barks");
	}
	void walks() {
		System.out.println("Dog walks");
	}
	void eat() {
		System.out.println("Dog likes to eat bone");
	}
	
	//This code is outside the main method and inside the class
	
	public static void main(String[] args) {
		
		Dog Jimmy=new Dog(); //how we create an object
		Jimmy.name="Jimmy";
		Jimmy.age=6;
		Jimmy.weight=16;
		Jimmy.color="Black";
		Jimmy.height=2.6;
		Jimmy.breed="German";
		Jimmy.bark();
		Jimmy.walks();
		Jimmy.eat();
		
		
		
	}
	
	

}
