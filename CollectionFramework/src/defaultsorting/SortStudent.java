package defaultsorting;

import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(103, "B");
		Student s2 = new Student(101, "C");
		Student s3 = new Student(102, "A");
		
		TreeSet<Student> t = new TreeSet();
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student obj : t) {
			System.out.println(obj);
		}
	}
}
