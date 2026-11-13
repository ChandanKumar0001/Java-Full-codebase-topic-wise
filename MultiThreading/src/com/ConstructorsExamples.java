package com;

class ConstructorsExamples {
	public static void main(String[] args) {
		
		//Default thread name is initialized
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		t1.setName("bike thread");
		System.out.println(t1.getName());
		
		System.out.println("-----------");
		
		// customer thread name is initialized
		Thread t2 = new Thread("car thread");
		System.out.println(t2.getName());
	}
}
