package sorting;

public class Student implements Comparable<Student> {
    int id;
    String name;
    double perc;

    public Student(int id, String name, double perc) {
        this.id = id;
        this.name = name;
        this.perc = perc;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        Double perc = this.perc;
        return perc.compareTo(anotherStudent.perc);
    }
}

