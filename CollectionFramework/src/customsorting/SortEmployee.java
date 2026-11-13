package customsorting;

import java.util.TreeSet;

public class SortEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(10,"Ambani", 29.45);
		Employee e2 = new Employee(30,"Birla", 23.67);
		
		SortEmployeeById id = new SortEmployeeById();
		SortEmployeeByName name = new SortEmployeeByName();
		SortEmployeeBySalary salary = new SortEmployeeBySalary();
		
		TreeSet<Employee> t = new TreeSet<Employee>(salary);
		//TreeSet<Employee> t = new TreeSet<Employee>(name);
		//TreeSet<Employee> t = new TreeSet<Employee>(id);
		
		t.add(e1);
		t.add(e2);
		t.add(new Employee(20, "Tata", 56.98));
		t.add(new Employee(15, "Kotak", 18.34));
		
		for(Employee emp : t) {
			System.out.println(emp);
		}
	}
}
