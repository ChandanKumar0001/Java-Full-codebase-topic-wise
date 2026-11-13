package com;

class Employee {
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Emp Id of "+name+" is "+id;
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(101,"John");
		System.out.println(emp);
	}
}
