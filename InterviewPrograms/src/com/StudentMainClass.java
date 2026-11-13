package com;

class StudentMainClass {
	
	static void findHighestMarks(Student s1, Student s2) {
		if(s1.marks > s2.marks) {
			System.out.println(s1);  // s1.toString()
		}
		else if(s2.marks > s1.marks) {
			System.out.println(s2);  //s2.toString()
		}
		else {
			System.out.println("Both Have same marks");
		}
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(101,"John",77);
		Student s2 = new Student(104,"Tom",94);
		System.out.println("Student with highest marks");
		findHighestMarks(s1,s2);
	}
}
