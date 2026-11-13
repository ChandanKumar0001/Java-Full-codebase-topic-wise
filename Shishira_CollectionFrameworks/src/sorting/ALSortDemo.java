package sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ALSortDemo {
	public static void main(String[] args) {
		Student1 s1 = new Student1(12,78.3,"Aishu");
		Student1 s2 = new Student1(4,61.3,"Prajwal");
		Student1 s3 = new Student1(25,41.7,"SRK");
		Student1 s4 = new Student1(17,98.3,"Anushka");
		
		List<Student1>lst=new LinkedList<Student1>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		
		for(int i=0; i<lst.size(); i++)
		{
			Student1 s = lst.get(i);
			System.out.println(s);
		}
		Collections.sort(lst);
		System.out.println("-------------------------------");
		for(int i=0; i<lst.size(); i++)
		{
			Student1 s= lst.get(i);
			System.out.println(s);
		}
	}
}
