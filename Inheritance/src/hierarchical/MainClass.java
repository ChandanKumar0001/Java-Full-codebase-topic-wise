package hierarchical;

class MainClass {
	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println(c.brand);
		System.out.println(c.Fuel);
		c.drive();
		
		System.out.println("-------------");
		
		Bike b = new Bike();
		System.out.println(b.brand);
		System.out.println(b.cost);
		b.ride();
	}
}
