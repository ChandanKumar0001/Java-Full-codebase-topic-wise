package day1;

class MethodExample2 {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int[] a = {10,20};
		
		try {
			System.out.println(a[99]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
}
