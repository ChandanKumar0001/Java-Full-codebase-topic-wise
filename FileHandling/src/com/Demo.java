package com;
import java.io.File;

class Demo {
	public static void main(String[] args) {
		
		//Object representation of a file name or folder name
		// File f = new File("Car");
		
		// folder gets created within e drive
		// File f = new file("e:/bike");
		
		// If path is not specified, file/folder gets created within the project itself
		File f = new File("Car");
		boolean result = f.mkdir();
		System.out.println(result); //System.out.println(f.mkdir());
		
	}
}
