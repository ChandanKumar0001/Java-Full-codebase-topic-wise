package javabean;

public class CarMainClass {
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.setBrand("RollsRoyals");
		
		String brand = c.getBrand();
		
		System.out.println("Brand: "+brand);
		
		System.out.println("Brand: "+c.getBrand());
	}
}
