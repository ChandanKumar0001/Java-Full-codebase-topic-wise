package customsorting;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee>{

	// Sort in descending order
	@Override
	public int compare(Employee x, Employee y) {
		return y.id - x.id;
	}
	
	// sort in default Ascending order
	/*@Override
	public int compare(Employee x, Employee y) {
		return x.id - y.id;
	}*/
}
