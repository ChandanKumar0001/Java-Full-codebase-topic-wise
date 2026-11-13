package day5;

import java.util.HashSet;

public class Demo {
	
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add(20);
		h.add(20.67);
		h.add(null);
		h.add(20);
		h.add("java");
		
		for(Object obj : h) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------------------");
		
		System.out.println(h);
		
		System.out.println("-----------------------------");
		
		System.out.println("Size: "+h.size());
	}
}
