package com;

class Employee {
	
	void display(int id){
		System.out.println("id: "+id);
	}
	
	void display(String name) {
		System.out.println("Name: "+name);
	}
	
	void display(String name, double salary) {
		System.out.println("Name: "+name+" Salary: "+salary);
	}
	
	void display(double salary, String name) {
		System.out.println("Salary: "+salary+" Name: "+name);
	}
	
}
