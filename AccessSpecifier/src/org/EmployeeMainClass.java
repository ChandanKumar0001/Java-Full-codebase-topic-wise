package org;

import com.Employee;

//Accessing public members in different package
public class EmployeeMainClass {
	public static void main(String[] args) {
		
		System.out.println("ID: "+Employee.id);
		System.out.println("Name: "+Employee.name);
		
		Employee emp = new Employee();
		emp.work();
	}
		
}
