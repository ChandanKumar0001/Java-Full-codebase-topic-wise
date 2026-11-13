package org;

class MainClass {
	public static void main(String[] args) {
		
		// Runnable Type of object
		Amazon obj = new Amazon();
		// Converting Runnable type object to Thread type object
		Thread t = new Thread(obj);
		// Initializing thread name
		t.setName("Amazon");
		// invoke start()
		t.start();
		
		//Converting above 4 lines code into 3 lines of code
		Amazon a = new Amazon();
		Thread t1 = new Thread(a,"amazon");
		t1.start();
		
		//Converting above 3 lines of code into 2 lines of code
		Thread t2 = new Thread(new Amazon(), "amazon");
		t2.start();
		
		//Converting above 2 lines of code into 1 line of code
		new Thread(new Amazon(), "amazon").start();
	}
}
