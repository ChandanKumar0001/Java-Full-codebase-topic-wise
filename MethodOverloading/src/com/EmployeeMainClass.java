package com;

class EmployeeMainClass {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.display(101);
		e.display("Tom");
		e.display("Jack", 2.8);
		e.display(2.9,"Smith");
	}
}
