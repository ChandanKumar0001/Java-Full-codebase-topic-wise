package rtp;

class MainRunner {
	
	static void display(Employee obj) {
		obj.work();
	}
	
	public static void main(String[] args) {
		//1. UpCasting using method
		display(new Developer());
		display(new Tester());
		
		System.out.println("-----------------");
		
		//2. UpCasting using separate reference variable
		Employee e1 = new Developer();
		e1.work();
		Employee e2 = new Tester();
		e2.work();
		
		System.out.println("---------------------");
		
		// 3. UpCasting using single reference variable
		Employee emp;
		emp = new Developer();
		emp.work();
		emp = new Tester();
		emp.work();
	}
}
