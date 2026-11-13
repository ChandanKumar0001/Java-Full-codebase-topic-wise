package day3;

class MainClass {
	public static void main(String[] args) {
		try {
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException e) {
				System.out.println("Invalid Denominator");
			}
			int[] a = {10,20};
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}
}
