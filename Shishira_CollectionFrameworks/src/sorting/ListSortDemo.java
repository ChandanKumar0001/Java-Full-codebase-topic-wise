package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ListSortDemo {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(10);
		lst.add(25);
		lst.add(90);
		System.out.println(lst);
		
		Collections.sort(lst);
		System.out.println(lst);
		Collections.sort(lst,Collections.reverseOrder());
		System.out.println(lst);
	}
}
