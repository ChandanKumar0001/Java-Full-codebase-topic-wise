package day5;

import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		
		String a = "A";
		String b = "B";
		
		System.out.println(a.compareTo(b));  // -1
		System.out.println(b.compareTo(a)); // +1
		System.out.println(b.compareTo(b)); // 0
		
		System.out.println("--------------------------------------");
		
		Integer x = 10;
		Integer y = 20;
		
		System.out.println(x.compareTo(y));    // -1
		System.out.println(y.compareTo(x));   // +1
		System.out.println(x.compareTo(x));  // 0
		
		System.out.println("--------------------------------------");
		
		Double i = 2.4;
		Double j = 3.5;
		
		System.out.println(i.compareTo(j));
		System.out.println(i.compareTo(i));
		System.out.println(j.compareTo(i));
		
		System.out.println("--------------------------------------");
		
		// Below code throw error because of TreeSet only allow Homogeneous not allowed Heterogeneous
		
//		TreeSet t = new TreeSet();
//		
//		t.add(10);
//		t.add(false);
//		t.add("dinga");
//		t.add(10.4);
//		
//		System.out.println(t);
	}
}
