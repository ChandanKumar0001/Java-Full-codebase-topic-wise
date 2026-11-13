package com;

class Father {
	void bike() {
		System.out.println("Old fashioned fathers bike!");
	}
}

class Son extends Father {
	
	@Override // annotation Override
	void bike() {
		System.out.println("New modified sons bike!");
	}
}

class MainClass {
	public static void main(String[] args) {
		Son s = new Son();
		s.bike();
	}
}
