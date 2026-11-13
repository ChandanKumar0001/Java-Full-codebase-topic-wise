package day2;

class Demo {
	public static void main(String[] args) {
		//ArithmeticException -> Unchecked
		//System.out.println(10/0);
		
		//InterruptedException -> Checked
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println("Handled");
			}
		}
	}
}
