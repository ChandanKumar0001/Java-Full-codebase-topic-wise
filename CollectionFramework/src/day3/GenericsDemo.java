package day3;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("20");
		l.add("sql");
		l.add("Java");
		
		for(String s: l) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------------------");
		
		LinkedList<Integer> x = new LinkedList<Integer>();
		
		x.add(10);
		x.add(34);
		//x.add(true); //its throw error because it's only support Integer type
		x.add(67);
		
		for(int i : x) { // for(Integer i : x) {  --> Because of internally AutoBoxing and Auto-Unboxing happens so you can write looping statement in both ways.
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------");
		
		ArrayList<Double> z = new ArrayList();
		
		//z.add("hai"); error because it is not double datatype
		z.add(8.99);
		z.add(102.34);
		z.add(3.45);
		
		for(double j : z) {
			System.out.println(j);
		}
		
	}
}
