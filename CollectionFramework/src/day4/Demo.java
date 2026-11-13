package day4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList x = new ArrayList();
		x.add(10);
		System.out.println(x);
		
		LinkedList y = new LinkedList(x);
		y.add(20);
		System.out.println(y);
		
		Vector z = new Vector(y);
		z.add(30);
		System.out.println(z);
		
		System.out.println("--------------------------------------------------------");
		
		// Here the default initial capacity 10
		ArrayList a = new ArrayList();
		
		// Here the initial capacity is 50 that i explicitly passed here
		ArrayList b = new ArrayList(50);
		
		// Here the default initial capacity 10
		LinkedList c = new LinkedList();
		
		// Here the default initial capacity 10
		Vector i = new Vector();
		
		// Here the initial capacity is 60 that i explicitly passed here 
		Vector j = new Vector(60);
		
		// Here we are initially passed the initial Capacity as well as incremental Capacity
		Vector k = new Vector(20, 5);
	}
}
