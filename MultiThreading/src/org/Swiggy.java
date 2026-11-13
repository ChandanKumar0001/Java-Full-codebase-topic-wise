package org;

// Swiggy is a thread type object
class Swiggy extends Thread{  // rule-1
	
	@Override   // rule-2
	public void run() {
		System.out.println("Ordering pizza from Swiggy");
	}
}
