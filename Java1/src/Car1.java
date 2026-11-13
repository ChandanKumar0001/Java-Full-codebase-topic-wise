class Car1 {
	String color = "green";
	String brand = "Lambo";
	
	public static void main(String[] args) {
		Car1 c1 = new Car1();
		System.out.println(c1.brand);
		Car1 c2 = new Car1();
		Car1 c3 = new Car1();
		Car1 c4 = new Car1();
		
		c4.color = "Red";
		c4.brand = "Ferrari";
	}

}
