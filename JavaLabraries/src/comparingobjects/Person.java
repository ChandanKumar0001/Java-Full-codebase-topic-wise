package comparingobjects;

class Person {
	int age;
	String name;
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals (Object obj) { //Object obj = new Person(20, "Tom");
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return this.age == p.age&&this.name.equals(p.name);
		}
		return false;
	}
	public static void main(String[] args) {
		Person p1 = new Person(20,"Tom");
		Person p2 = new Person(20,"Tom");
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(new Person(20,"Tom")));
		if(p1.equals(p2)) {
			System.out.println("Age and name are same");
		}
		else {
			System.out.println("Age and name are different");
		}
	}
}
