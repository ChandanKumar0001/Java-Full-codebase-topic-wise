//Accessing non-static members inside same class
class Ccar {
	//Non-static variables
	String brand="Honda";
	int cost=500000;
	
	//Non-static method
	void start() {
		System.out.println("Car Started");
	}
	
	public static void main(String[] args) {
		Ccar c=new Ccar();
		System.out.println("Brand: "+c.brand);
		System.out.println("Cost: "+c.cost);
		c.start();
	}
}
