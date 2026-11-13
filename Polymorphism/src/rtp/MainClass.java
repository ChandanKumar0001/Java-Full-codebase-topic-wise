package rtp;

class MainClass {
	// display(new Car()); -> Vehicle obj = new Car(); -> obj.start(); ->Car Started
	// display(new Bike()); -> Vehicle obj = new Bike(); -> obj.start(); ->Bike Started
	static void display (Vehicle obj) {
		obj.start();
	}
	
	public static void main(String[] args) {
		// 1. Upcasting using method
		display(new Car()); // rule-3
		display(new Bike()); //rule-3
		System.out.println("----------------");
		
		
		//2. Upcasting using seperate reference variable
		Vehicle v1 = new Car(); //rule-3
		v1.start();
		Vehicle v2 = new Bike(); //rule-3
		v2.start();
		System.out.println("-----------------");
		
		
		// 3. Upcasting using single reference variable
		Vehicle v;  //SuperClass reference
		v = new Car(); //rule-3
		v.start();
		v = new Bike(); //rule-3
		v.start();
	}
}
