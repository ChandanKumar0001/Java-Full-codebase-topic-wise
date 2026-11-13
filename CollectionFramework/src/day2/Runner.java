package day2;

import java.util.*;

public class Runner {

public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		System.out.println("Objects inside ArrayList: "+al+" Size:"+al.size());
		
		System.out.println("--------------------------------------------------------");
		
		LinkedList ll = new LinkedList();
		
		ll.addAll(al);
		ll.add(30);
		System.out.println("Objects inside LinkedList: "+ll+" Size:"+ll.size());
		
		// removeAll() is used to remove all the objects of one collection from another collection.
		ll.removeAll(al);
		
		System.out.println("Objects inside LinkedList: "+ll+" Size:"+ll.size());
	}
}
