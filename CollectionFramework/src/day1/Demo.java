package day1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		/* add() is used to add an object into the collection */
		l.add(10);
		l.add(20.34);
		l.add(10);
		l.add(null);
		l.add("Java");
		
		System.out.println(l);
		
		System.out.println("-----------------------------------");
		
		/* size() is used to return the length of the collection */
		System.out.println(l.size());
		
		System.out.println("-----------------------------------");
		
		/* get() is used to return an object based on the index position */
		System.out.println(l.get(2));
		
		//System.out.println(l.get(250));  IndexOutOfBoundsException
		
		System.out.println("-----------------------------------");
		
		/* contains() is used to check if the object is present in the collection or not */
		System.out.println(l.contains("Java"));
		System.out.println(l.contains("java")); //returns false because of case sensitive
		
		System.out.println("-----------------------------------");
		
		System.out.println(l);
		
		/* remove() is used to remove object based on the index position */
		l.remove(2);
		
		System.out.println(l);
		
		System.out.println("-----------------------------------");
		
		/* isEmpty() is used to check if the Collection is Empty or not */
		System.out.println(l.isEmpty());
		
		/* clear() will remove all the objects from the Collection */
		l.clear();
		
		System.out.println(l.isEmpty());
		
		System.out.println("***********************************");
		
		ArrayList x = new ArrayList();
		
		x.add(20);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(60);
		
		System.out.println(x);
		
		System.out.println("-----------------------------------");
		
		/* indexOf() is used to find the index position of an object and find occurrence in case of duplication */
		System.out.println(x.indexOf(30));
		System.out.println(x.indexOf(10));
		System.out.println(x.indexOf(100)); // -1 it give as output if the object not present
		
		System.out.println("-----------------------------------");
		
		/* lastIndexOf() is used to find the last index position of an object */
		System.out.println(x.lastIndexOf(10));
		
	}
}
