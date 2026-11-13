public class Laptop{
	public static void main(String[] args)
	{
		System.out.println("Start Laptop main()");
		new Laptop();
		new Mobile();
		System.out.println("Stop Laptop main()");
		
		Mobile.main(args);
	}
}