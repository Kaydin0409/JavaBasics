package com.syntax.class12;

public class Phone {
	
	//attributes are fields
	String model;
	String make;
	String OS;
	double screenSize;
	int RAM;
	int storage;
	int cameraMP;
	
	//Behaviors are methods
	void call(){
		System.out.println("calling someone");
	}
	
	void takePicture() {
		System.out.println("use my camera app to take pictures");
	}
	
	
	public static void main(String[] args) {
		// Creating objects inside the main method
		
		Phone s22Ultra = new Phone();
		s22Ultra.make="Samsung";
		s22Ultra.model="Samsung Galaxy S22 Ultra";
		s22Ultra.screenSize=6.8;
		s22Ultra.RAM=12;
		s22Ultra.storage=512;
		s22Ultra.cameraMP=108;
		System.out.println(s22Ultra.storage);
		s22Ultra.call();
		
		
		
		

	}


}
