package com;
class Vehicle {
	
	int numberOfSeats;
	int numberOfWheels;
	String color;
	
	Vehicle(int numberOfSeats, int numberOfWheels, String color ){
		this. numberOfSeats = numberOfSeats;
		this.numberOfWheels = numberOfWheels;
		this.color = color;
	}
}

class Bus extends Vehicle{
	Bus(){
		super(78, 6,"Red");
		System.out.println(numberOfSeats);
		System.out.println(numberOfWheels);
		System.out.println(color);
	}	
}

class Bike extends Vehicle{
	Bike(){
		super(55, 8,"Green");
		System.out.println(numberOfSeats);
		System.out.println(numberOfWheels);
		System.out.println(color);
	}	
}
class Car extends Vehicle{
	Car(){
		super(32, 6,"White");
		System.out.println(numberOfSeats);
		System.out.println(numberOfWheels);
		System.out.println(color);
	}	
}

class SuperClass{
	public static void main(String[] args) {
		// Bus b = new Bus();
		// Bike bi = new Bike ();
		Car c = new Car();
	}
}