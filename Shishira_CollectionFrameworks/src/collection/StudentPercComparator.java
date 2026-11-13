package collection;

import java.util.Comparator;

public class StudentPercComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		Double per = s1.perc;
		return per.compareTo(s2.perc);
	}
}
