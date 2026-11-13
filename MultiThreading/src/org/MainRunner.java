package org;

class MainRunner {
	public static void main(String[] args) {
		
		Swiggy s = new Swiggy();
		s.setName("swiggy");
		s.start();  // rule-3
		
		PhonePe p = new PhonePe();
		Thread t = new Thread(p);  // rule-3
		t.setName("phonepe");
		t.start();   // rule-4
	}
}
