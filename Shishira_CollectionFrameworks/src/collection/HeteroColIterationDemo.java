package collection;

import java.util.LinkedList;
import java.util.List;

public class HeteroColIterationDemo {
	public static void main(String[] args) {
		Tree t = new Tree();
		Employee e = new Employee();
		Pen p = new Pen();
		
		//heterogeneous
		List<Object> lst = new LinkedList<Object>();
		lst.add(t);  lst.add(e);   lst.add(p);
		
		for(int i=0; i<lst.size(); i++) {
			Object obj = lst.get(i);
			if(obj instanceof Tree) {
				Tree tr = (Tree) obj;
				tr.grow();
				System.out.println(tr.type+" "+tr.heigth);
			}
			else if(obj instanceof Employee) {
				Employee emp = (Employee) obj;
				emp.work();
				System.out.println(emp.dept+" "+emp.salary);
			}
		}
	}
}
