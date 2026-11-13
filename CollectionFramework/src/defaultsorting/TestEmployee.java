package defaultsorting;

import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(2,"John", 45.67);
		Employee e2 = new Employee(1,"Jack", 62.45);
		
		TreeSet<Employee> t = new TreeSet();
		
		t.add(e1);
		t.add(e2);
		t.add(new Employee(4,"Tom",12.56));
		t.add(new Employee(3,"Array",99.41));
		
		for(Employee e : t) {
			System.out.println(e);
		}
	}
}
