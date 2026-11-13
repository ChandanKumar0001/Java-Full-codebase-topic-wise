package customsorting;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee>{

	// in Descending order
	@Override
	public int compare(Employee x, Employee y) {
		return y.name.compareTo(x.name);
	}
	
	
	// Default ascending order
	/*@Override
	public int compare(Employee x, Employee y) {
		return x.name.compareTo(y.name);
	}*/
}
