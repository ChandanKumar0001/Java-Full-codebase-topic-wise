package day2;

// * used for import all java.util package instead of one by one ArrayList and LinkedList
import java.util.*;

public class Example {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		System.out.println("Objects inside ArrayList: "+al+" Size:"+al.size());

		System.out.println("--------------------------------------------------------");

		LinkedList ll = new LinkedList();

		/**
		 *  addAll() is used to add all the objects of one collection into another collection 
		*/
		ll.addAll(al);
		ll.add(30);
		System.out.println("Objects inside LinkedList: "+ll+" Size:"+ll.size());

		System.out.println("--------------------------------------------------------");
		
		/**
		 *  containsAll() is used to check all the objects of one collection is present inside another collection or not. 
		*/
		System.out.println(ll.containsAll(al)); // true
		
		ll.remove(1);
		
		System.out.println("Objects inside LinkedList: "+ll+" Size: "+ll.size());
		System.out.println(ll.containsAll(al));
	}
}
