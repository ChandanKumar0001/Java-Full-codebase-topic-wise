package com;

public class Largest_Among_Three_Number {
	
	public static void main(String[] args) {
		
		int a = 62;
		int b = 84;
		int c = 52;
		
		if(a>b && a>c) {
			
			System.out.println("A is Greatest!");
		}
		
		else if(b>a && b>c) {
			
			System.out.println("B is Greatest!");
		}
		
		else if (c>a && c>b) {
			
			System.out.println("C is Greatest!");
		}
		
		else if (a==b && b==c) {
			
			System.out.println("A, B and C All are equal!");
		}
		
		else
			System.out.println("Invalid Input!");
	}

}
