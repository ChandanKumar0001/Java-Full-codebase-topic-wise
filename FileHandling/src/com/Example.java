package com;
import java .io.File;

class Example {
	public static void main(String[] args) {
		
		File f = new File("employee.txt");
		
		if(f.exists()) {
			f.delete();
			System.out.println("File/Folder Deleted");
		}
		else {
			System.out.println("File/Folder not Present");
		}
	}
}
