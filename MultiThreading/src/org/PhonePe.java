package org;

// PhonePe is a runnable type object
class PhonePe implements Runnable{  // rule-1
	
	@Override  // rule-2
	public void run() {
		System.out.println("Paying Rupees:200 from PhonePe");
	}
}
