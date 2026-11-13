package defaultsorting;

public class Student implements Comparable<Student> {

	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+" "+name;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
	
	
	/*@Override
	public int compareTo(Student s) {
		return this.id - s.id;
	}*/
}
