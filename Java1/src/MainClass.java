// Accessing non-static members in different class
class MainClass {
	public static void main(String args[]) {
		Person p = new Person(); //object creation
		System.out.println("Name is "+p.name);
		p.walk();
	}
}
