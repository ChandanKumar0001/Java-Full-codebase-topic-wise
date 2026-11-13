package com;

class Bike extends Vehicle{
	
	Bike(){
		super("suzuki"); // is used Explicitly
		System.out.println("In Bike");
	}
	
	public static void main(String[] args) {
		Bike b = new Bike();
	}
}
