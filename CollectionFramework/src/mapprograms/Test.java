package mapprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap();
		
		hm.put("tom", 22);
		hm.put("jerry", 21);
		hm.put("bheem", 23);
		
		Set<String> s1 = hm.keySet();
		
		for(String key : s1) {
			System.out.println(key+" is "+hm.get(key)+" Years old");
		}
		
		System.out.println("--------------------------------------------");
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap();
		
		lhm.put(10, "Java");
		lhm.put(20, "Sql");
		lhm.put(30, "Web");
		
		Set<Integer> s = lhm.keySet();
		
		for(int key : s) {
			System.out.println(key+"--> "+lhm.get(key));
		}
		
		System.out.println("--------------------------------------------");
		
		TreeMap<Integer, Double> t = new TreeMap();
		
		t.put(20, 1.5);
		t.put(30, 2.5);
		t.put(10, 4.5);
		
		Set<Integer> s2 = t.keySet();
		
		for(int key : s2) {
			System.out.println(key+" : "+t.get(key));
			
		}
	}
}
