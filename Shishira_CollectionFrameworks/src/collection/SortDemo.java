package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class SortDemo {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Satyam", 71.8);
		Student s2 = new Student(12,"pranav", 92.4);
		Student s3 = new Student(5,"Jeevitha", 80.1);
		Student s4 = new Student(20,"Shivam", 74.5);
		Student s5 = new Student(16,"Guldu", 35.01);
		
		List<Student> lst = new LinkedList<Student>();
		lst.add(s1);   lst.add(s2);   lst.add(s3);
		lst.add(s4);   lst.add(s5);
		
		//Comparator<Student> ctr = new StudentNameComparator();
		Comparator<Student> ctr = new StudentIDComparator();
		//Comparator<Student> ctr = new StudentPercComparator();
		
		for(Student student:lst) {
			System.out.println(student);
		}
		
		System.out.println();
		Collections.sort(lst,ctr);
		
		for(Student student : lst) {
			System.out.println(student);
		}
	}
}
