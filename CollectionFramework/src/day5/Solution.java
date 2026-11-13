package day5;

import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<String>();
		
		// Below given data will be shorted based on ASCII Value
		t.add("Banana");
		t.add("Cat");
		t.add("Apple");
		
		System.out.println(t);
		
		System.out.println("-----------------------");
		
		for(String s : t) {
			System.out.println(s);
		}
	}
}
