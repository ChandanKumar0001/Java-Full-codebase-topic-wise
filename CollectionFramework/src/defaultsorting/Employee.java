package defaultsorting;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	Double salary;
	
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee e) {
		return this.salary.compareTo(e.salary);
		//return (int) (this.salary - e.salary); --> here we use typeCasting so we Explore it in next session
	}
	
	// for Descending order
	/*@Override
	public int compareTo(Employee e) {
		return e.name.compareTo(this.name);
	}*/
	
	// for Descending order 
	/*@Override
	public int compareTo(Employee e) {
		return e.id - this.id;
	}*/
}
