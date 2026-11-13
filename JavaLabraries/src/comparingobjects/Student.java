package comparingobjects;

class Student {
	
	int age;
	
	Student(int age){
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) { //UpCasting -> Object obj = new Student(20);
		if(obj instanceof Student) { // Checking if ref var is having Student object
			Student s = (Student) obj; //DownCasting
			return this.age == s.age; //s1.age==s2.age; -> 20 == 20 -> true
		}
		return false;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(20);
		Student s2 = new Student(20);
		System.out.println(s1.equals(s2)); 
	}
}
