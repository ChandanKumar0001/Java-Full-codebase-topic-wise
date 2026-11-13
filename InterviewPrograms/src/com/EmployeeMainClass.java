package com;

class EmployeeMainClass {
	
	static void findHighestsalary(Employee e1, Employee e2) 
	{
		if(e1.salary > e2.salary)
		{
			System.out.println(e1);
		}
		else if(e2.salary > e1.salary)
		{
			System.out.println(e2);
		}
		else
			System.out.println("Both Employee salary is same");
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Tom", 8000);
		Employee e2 = new Employee("Jerry",10000);
		System.out.println("Employee with highest salary");
		findHighestsalary(e1,e2);
	}
	
}
