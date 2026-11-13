package nonprimitivecasting;

class solution {
	public static void main(String[] args) {
		
		//Upcasting
		Person p = new Student();
		System.out.println(p.name);
		
		System.out.println("-----------");
		
		//Downcasting
		Student s = (Student) p;
		System.out.println(s.name+" "+s.marks);
	}
}
