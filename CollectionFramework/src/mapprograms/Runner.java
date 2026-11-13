package mapprograms;

import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		h.put(1, "Soni");
		h.put(2, "Apple");
		
		System.out.println(h);
		
		h.put(1, "Nokia");
		
		System.out.println(h);
	}
}
