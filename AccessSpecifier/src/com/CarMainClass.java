package com;

//Accessing public members in
//different class, & same package
public class CarMainClass {
	public static void main(String[] args) {
		System.out.println("Brand: "+Car.brand);
		
		Car c = new Car();
		System.out.println("Cost: "+c.cost);
	}
}
