package Car;

class Mobile {
	
	static String brand = "Apple";
	
	static void call() {
		System.out.println("Calling a friend");
	}
	
	public static void main(String[] args) {
		System.out.println("Brand: "+Mobile.brand);
		Mobile.call();
	}
}
