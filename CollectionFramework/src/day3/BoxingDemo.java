package day3;

public class BoxingDemo {

	public static void main(String[] args) {
		
		// Primitive way of representing 10
		int a = 10;
		
		// Non-Primitive way to representing 10
		Integer b = new Integer(10);
		
		System.out.println(a+" "+b);
		
		System.out.println("-------------------------------------");
		
		// Primitive way of representing 'A'
		char x = 'A';
		
		// Non-Primitive way of representing 'A'
		Character y = new Character('A');
		
		System.out.println(x+" "+y);
		
		System.out.println("=====================================");
		
		// AutoBoxing ---> converting the primitive type to non-primitive type
		int i = 5;
		Integer j = new Integer(i);
		System.out.println(i+" "+j);
		
		System.out.println("-------------------------------------");
		
		// AutoBoxing 
		char p = 'z';
		Character q = new Character(p);
		System.out.println(p+" "+q);
		
		System.out.println("=======================================");
		
		// Auto UnBoxing  ---> converting the non-primitive type to primitive type
		Integer c = new Integer(50);
		int d = c;
		System.out.println(c+" "+d);
		
		System.out.println("-------------------------------------");
		
		// Auto UnBoxing 
		Double obj = new Double(5.2);
		double u = obj;
		System.out.println(obj+" "+u);
		
	}
}

// All Wrapper class are pre-defined classes present in java.lang package.
// All Wrapper class have overridden toString()
