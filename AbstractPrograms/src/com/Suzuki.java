package com;

class Suzuki extends Car{
	
	@Override
	void start() {
		System.out.println("Car Started");
	}
	
	@Override
	void drive() {
		System.out.println("Driving Car");
	}
	
	public static void main(String[] args) {
		
		Suzuki s = new Suzuki();
		s.start();
		s.drive();
	}

}
