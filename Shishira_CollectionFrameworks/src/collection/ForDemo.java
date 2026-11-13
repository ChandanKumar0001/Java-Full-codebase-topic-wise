package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForDemo {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("yellow");           lst.add("red");
		lst.add("white");            lst.add("blue");
		lst.add("pink");             lst.add(null);
		lst.add("red");              lst.add("black");
		
		//forward iteration
		for(int i=0; i<lst.size(); i++) {
			String clr = lst.get(i);
			System.out.println(clr);
		}
		System.out.println();
		System.out.println("-----------------------");
		System.out.println();
		
		//backward iteration
		for(int i=lst.size()-1; i>=0; i--) {
			String clr = lst.get(i);
			System.out.println(clr);
		}
		
		
		
		
		/*
		Set<Fruit> set = new HashSet<Fruit>();
		set.add(new Fruit("apple", "green"));
		set.add(new Fruit("mango", "yellow"));
		set.add(new Fruit("Guava", "pink"));
		
		for(Fruit f : set) {
			System.out.println(f);
		}*/
	}
}
