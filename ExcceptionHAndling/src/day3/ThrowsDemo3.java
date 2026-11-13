package day3;
import java.io.*;

class ThrowsDemo3 {
	
	static void read() throws FileNotFoundException{
		FileReader f = new FileReader("Car.txt");
	}
	
	public static void main(String[] args) {
		try {
			read();
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
}
