package operators;
import java.util.Scanner;

class Logical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		
		System.out.println(a==b && a>=b);
		sc.close();
	}
}
