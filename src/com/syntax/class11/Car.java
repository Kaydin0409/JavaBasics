package com.syntax.class11;

public class Car {
	
	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int noOfDoors;
	int HP;
	
	void moveForward() {
		System.out.println("Car is moving forward");
	}
	void reverse() {
		System.out.println("Moving backwards");
	}
	
	public static void main(String[] args) {
		
		Car Tesla=new Car();
		Tesla.model="X";
		Tesla.make="Tesla";
		Tesla.color="red";
		Tesla.year=2022;
		Tesla.typeOfEngine="V8";
		Tesla.noOfDoors=4;
		Tesla.HP=600;
		Tesla.moveForward();
		Tesla.reverse();
		
		Car Lexus=new Car();
		Lexus.make="Lexus";
		Lexus.model="LFA";
		Lexus.color="white";
		Lexus.year=2019;
		Lexus.moveForward();
		
		
		
		
		
		
	}

}
