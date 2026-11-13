package com;
import java .io.File;
import java.util.Date;

class Solution {
	public static void main(String[] args) {
		
		// Specifying the filename
		File f= new File("car.txt");
		
		// Fetting milliSeconds value
		long milliSeconds = f.lastModified();
		
		// Converting milliSeconds into Date format
		Date d = new Date (milliSeconds);
		
		// Printing reference variable as toString() is Overridden
		System.out.println(d);
		
		System.out.println("-----------------------"); // Optimize the above code in less line
		
		File f1 = new File("car.txt");
		Date d1 = new Date(f1.lastModified());
		System.out.println(d1);
		
		System.out.println("-------------------------");// Again optimize the above code in less line
		
		Date d2 = new Date (new File("Car.txt").lastModified());
		System.out.println(d2);
		
		System.out.println("-------------------------------"); // Again Optimize the above code
		
		System.out.println(new Date(new File("car.txt").lastModified()));
	}
}
