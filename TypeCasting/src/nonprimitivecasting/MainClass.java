package nonprimitivecasting;

class MainClass {
	public static void main(String[] args) {
		
		//Upcasting
		Vehicle v= new Car();
		System.out.println(v.brand);
		
		System.out.println("---------------");
		
		//Downcasting
		
		Car c = (Car) v;
		System.out.println(c.brand);
		c.drive();
	}
}
