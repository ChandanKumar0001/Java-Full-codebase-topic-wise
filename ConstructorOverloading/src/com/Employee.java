package com;

class Employee {
	
	Employee(int id){
		System.out.println("Id: "+id);
	}
	
	Employee(String name){
		System.out.println("Name: "+name);
	}
	
	Employee(int age, String name){
		System.out.println("Age: "+age+"Name: "+name);
	}
	
	Employee(String name, int age){
		System.out.println("Name: "+name+"age: "+age);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101);
		Employee e2 = new Employee("John");
		Employee e3 = new Employee(21, "Alex");
		Employee e4 = new Employee("jack", 23);
	}
}
