package com;

class CalculatorMainClass {
	public static void main(String[] args) {
		
		Calculator calc = new Calculatorimpl(); // rule-4 -> UC
		
		calc.add(10, 20);
		calc.mul(5, 6);
	}
}

/* ctrl+hover on "add" and "open the declearation" method this fetch 
you that add method in another class where add method is decleared.*/