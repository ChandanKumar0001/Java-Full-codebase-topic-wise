package sorting;

public class Student1 implements Comparable<Student1> {
	int id;
	double perc;
	String name;
	
	public Student1(int id, double perc, String name)
	{
		this.id=id;
		this.name=name;
		this.perc=perc;
	}
	
	@Override
	public String toString()
	{
		return this.id+" "+this.name+" "+this.perc;
	}
	
	@Override
	public int compareTo(Student1 anotherStudent)
	{
		return anotherStudent.name.compareToIgnoreCase(this.name);
	}
}
