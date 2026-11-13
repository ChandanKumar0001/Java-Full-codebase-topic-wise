package day3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {

		int a = 10;
		int b = 'z';

		ArrayList l = new ArrayList();

		// In below line internally AutoBoxing and Auto-Unboxing happens
		l.add(a);      // l.add(new Integer(a));  ->  l.add(new Integer(10);

		// in below line of code internally its converted to its non-decimal value because of here AutoBoxing happens internally
		l.add(20.45);  // l.add(new Double(21.45));

		l.add(b);     // l.add(new Character(b));  --> l.add(new Character ('z'));

		for(Object o : l) {
			System.out.println(o);
		}
		
		System.out.println("-------------------------------------");
		
		LinkedList ll = new LinkedList();
		
		ll.add(10);       // new Integer(10);
		ll.add("java");  // new String("java");
		ll.add(1.2);    //new Double(1.2);
		
		for(Object obj : ll) {
			System.out.println(obj);
		}
	}
}
