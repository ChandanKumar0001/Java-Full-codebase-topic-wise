package mapprograms;

import java.util.Set;
import java.util.TreeMap;

public class Fruits {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> t = new TreeMap();
		
		t.put("Mango", 23);
		t.put("Apple", 20);
		t.put("Banana", 15);
		
		Set<String> s = t.keySet();
		
		for(String key : s) {
			System.out.println("Cost of 1kg "+key+" is "+t.get(key));
		}
	}
}
