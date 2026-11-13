package com;

class Employee {
	
	Employee(int id){//id=101
		this(2.5);
		System.out.println("ID: "+id);
	}
	Employee(String name,int age){//name:Tom Age:22
		System.out.println("Name: "+name+" "+"Age: "+age);
	}
	Employee(double salary){//salary:2.5
		this("Tom",22);
		System.out.println("Salary: "+salary);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(23);
	}
}
