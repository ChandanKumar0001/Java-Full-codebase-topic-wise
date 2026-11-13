package com;

class Demo {
	
	public static void main(int x) {
		System.out.println("x: "+x);
	}
	
	public static void main(String[] x) {
		System.out.println("start");
		main(10);
		main(2.5);
		System.out.println("end");
	}
	
	public static void main(double x) {
		System.out.println("x: "+x);
	}
}
