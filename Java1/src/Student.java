class Student {
	static int age = 22; //static variable
	
	static void study() {//static method
		System.out.println("Studying");
	}
	
	public static void main(String[] args) {
		System.out.println("Age is "+Student.age);
		Student.study();
		
		System.out.println("----");
		
		System.out.println("Age is "+age); // ClassName.age -> Student.age
		study(); // ClassName.study() -> Student.study();
	}
}
