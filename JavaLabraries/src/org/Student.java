package org;

class Student {
	
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Name:"+name+" Marks:"+marks;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("John", 56);
		Student s2 = new Student("Jack", 67);
		
		Student[] s = {s1,s2};
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);  // printing s1,s2 (reference variable)
		}                             // calls toString() internally
	}                                // -> s1.toString()and s2.toString()
}
