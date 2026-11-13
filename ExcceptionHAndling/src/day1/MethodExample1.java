package day1;

class MethodExample1 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
