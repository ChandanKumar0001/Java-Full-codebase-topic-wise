package collection;

public class Student {

	int id;
	String name;
	double perc;

	public Student(int id, String name, double perc) {
		this.id=id;
		this.name=name;
		this.perc=perc;
	}

	@Override
	public String toString() {
		return this.id+" "+this.perc+" "+this.name;
	}

	//many methods of Student class --->business methods
	public void sleep() {

	}

	public void study() {

	}

	//Don't Write any sorting logic
}
