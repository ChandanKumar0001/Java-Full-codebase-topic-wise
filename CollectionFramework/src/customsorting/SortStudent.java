package customsorting;

import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(22,"Dinga");
		Student s2 = new Student(23,"Guldu");
		Student s3 = new Student(21,"Tom");
		
		SortStudentByAge age = new SortStudentByAge();
		
		SortStudentByName name = new SortStudentByName();
		
		TreeSet<Student> t = new TreeSet(name);
		//TreeSet<Student> t = new TreeSet(age);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student s : t) {
			System.out.println(s);
		}
	}

}
