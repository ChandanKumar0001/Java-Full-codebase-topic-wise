package primitivecasting;

class Demo {
	public static void main(String[] args) {
		
		//Widening
		int a=25;
		double b=a;
		System.out.println(a+" "+b);
		
		double c=100;
		System.out.println(c); //100.0
		
		char i='A';
		int j=i;
		System.out.println(i+" "+j); // A 65
		
		System.out.println("-------------");
		
		//Narrowing
		double x = 12.34;
		int y = (int) x;
		System.out.println(x+" "+y); //12.34 12
		
		int z = (int) 45.66;
		System.out.println(z); //45
		
		int p = 68;
		char q = (char) p;
		System.out.println(p+" "+q); //68 D
		
		System.out.println("-----------");
		
		System.out.println((int) 98.56); //98
		System.out.println((char)65); //A
		System.out.println("A"+"B"); //AB
		System.out.println("A"+10); //A10
		System.out.println('A'+"B"); //AB
		System.out.println("A"+10+20); //A1020
		System.out.println(10+20+"A"); //30A
		System.out.println('A'+'B'); //131
		System.out.println('a'+20); //117
	}
}
