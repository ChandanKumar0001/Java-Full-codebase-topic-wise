package multilevel;

class MainClass {
	public static void main(String[] args) {
		Department d = new Department();
		
		System.out.println("College Name: "+d.collegeName);
		System.out.println("Department Name: "+d.departmentName);
		
		d.conductInternals();
		d.conductExams();
	}
}
