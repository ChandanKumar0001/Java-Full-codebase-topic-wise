package com;
import java.io.File;
class MainClass {
	public static void main(String[] args) {
		
		File f1 = new File("Car");
		File f2 = new File("Bike");
		System.out.println(f1.renameTo(f2));
	}
}
