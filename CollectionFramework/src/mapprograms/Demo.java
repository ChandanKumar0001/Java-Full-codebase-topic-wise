package mapprograms;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		// put() is used to add key and value inside Map
		h.put(10, "dinga");
		h.put("guldu", 10.45);
		h.put(1.2, 100);
		
		System.out.println(h);
		
		System.out.println("-------------------------");
		
		// get() is used to get an value based on the key Specified
		System.out.println(h.get(10));
		System.out.println(h.get(230));
		
		System.out.println("-------------------------");
		
		// containsKey() is used to check the key is present or not
		System.out.println(h.containsKey("Guldu"));
		System.out.println(h.containsKey("guldu"));
		
		System.out.println("-------------------------");
		
		// containsValue() is used to check the Value is present or not
		System.out.println(h.containsValue(10.45));
		System.out.println(h.containsValue("Dinga"));
		
		System.out.println("-------------------------");
		
		System.out.println(h);
		
		// remove() is used to remove an value based on the key specified
		h.remove(10);
		
		System.out.println(h);
		
		System.out.println("-------------------------");
		
		// isEmpty() is used to check if the Collection is empty or not
		System.out.println(h.isEmpty());
		
		// clear() is used to remove all the objects from the Collection
		h.clear();
		
		System.out.println(h.isEmpty());
		
		System.out.println("-------------------------");
		
	}
}
