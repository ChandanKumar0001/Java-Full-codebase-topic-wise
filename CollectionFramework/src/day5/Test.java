package day5;

import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Java");
		lhs.add("Python");
		lhs.add("Java");
		lhs.add("JavaScript");
		
		for(String subject : lhs) {
			System.out.println(subject);
		}
	}
}
