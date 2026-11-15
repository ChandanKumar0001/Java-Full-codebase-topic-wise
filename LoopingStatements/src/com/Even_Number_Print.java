package com;

public class Even_Number_Print {
	
	public static void main(String[] args) {
		
		// print even number from 1-10
		for(int i=2; i<=10; i=i+2) {
			
			System.out.println(i);
		}
		
		
		System.out.println("-------------------------------------");
		
		// print odd number from 1-10
		for(int i=1; i<=10; i+=2) {  //i=i+2
			
			System.out.println(i);
		}
		
		
		System.out.println("--------------------------------");
		
		// print multiples of 3 from 1-15
		for(int i=1; i<=15; i=i*3) {
			
			System.out.println(i);
		}
	
		System.out.println("------------------------------------");
		
		//Even number in reverse order 10-2
		for(int i=10; i>=2; i=i-2) {
			
			System.out.println(i);
		}
	}

}
