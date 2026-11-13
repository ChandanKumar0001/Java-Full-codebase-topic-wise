package comparingobjects;

class Employee {
	int salary;
	
	Employee(int salary){
		this.salary = salary;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Employee) {
		Employee e = (Employee) obj;
		return this.salary == e.salary;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee(8000);
		Employee e2 = new Employee(8000);
		Employee e3 = new Employee(9000);
		System.out.println(e1.equals(e2)); //true
		System.out.println(e1.equals(e3)); //false
	}
}
