package constructor;

class Student {
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	
	
	public static void main(String[] args) {
		Student s1= new Student("Tom", 45);
		Student s2= new Student("John", 43);
		Student s3= new Student("James", 42);
		System.out.println(s1.name+"has scored"+s1.marks+"marks");
		System.out.println(s2.name+"has scored"+s2.marks+"marks");
		System.out.println(s3.name+"has scored"+s3.marks+"marks");
	}
	
}
