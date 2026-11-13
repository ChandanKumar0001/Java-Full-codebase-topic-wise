class Mobile1 {
	String brand;
	int cost;

	Mobile1(String brand, int cost)
	{
		this.brand= brand;
		this.cost= cost;
	}

	public static void main(String args[]) {
		Mobile1 m1= new Mobile1("Samsung", 10000);
		Mobile1 m2= new Mobile1("Apple",20000);
		System.out.println("Brand:"+m1.brand+"  Cost:"+m1.cost);
	}
}