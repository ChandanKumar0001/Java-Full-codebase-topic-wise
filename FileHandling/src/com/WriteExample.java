package com;
import java.io.File;
import java.io.FileWriter;

class WriteExample {
	public static void main(String[] args) throws Exception {
		
		File f = new File("demo.txt");
		
		FileWriter fw = new FileWriter(f, true); // append=true(by default it is false
// when you give append as true and change the write data that time this new data will concatenate and store with data and stored it.
		fw.write("Studying ");
		fw.write("Java");
		
		fw.flush();
		fw.close();
		
		System.out.println("Stored Data Successfully! ");
	}
}
