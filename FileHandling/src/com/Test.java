package com;
import java.io.File;
class Test {
	public static void main(String[] args) throws Exception{
		
		// .txt, .doc, .xlsx, .pdf
		//File f = new File("e:/employee.txt");
		
		File f = new File("employee.txt");
		System.out.println(f.createNewFile());
		
	}
}
