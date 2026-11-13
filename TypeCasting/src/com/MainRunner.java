package com;

class MainRunner {
	
	static void display(Person obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			System.out.println("Name:"+s.name+" Marks"+s.marks);
		}
		else if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			System.out.println("Name:"+e.name+" Marks"+e.salary);
		}
	}
	public static void main(String[] args) {
		display(new Student());
		System.out.println("---------------");
		display(new Employee());
	}
}
