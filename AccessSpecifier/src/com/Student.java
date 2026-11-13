package com;

// Accessing public members inside same class
public class Student {
	
	public int age = 20;
	public String name = "Tom";
	
	public static void study(){
		System.out.println("Studying Java");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Age: "+s.age);
		System.out.println("Name: "+s.name);
		Student.study(); //study()
	}
}
