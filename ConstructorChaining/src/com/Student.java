package com;

class Student {
	
	Student(int age){//age=20
		System.out.println("Age: "+age);
	}
	Student(String name){//name="Tom"
		this(20);
		System.out.println("Name: "+name);
	}
	Student(double height){//height=5.6
		this("Tom");
		System.out.println("Height: "+height);
	}
	
	public static void main(String[] args) {
		Student s = new Student(5.6);
	}
}
