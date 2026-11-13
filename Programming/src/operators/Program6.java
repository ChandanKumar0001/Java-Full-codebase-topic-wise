package operators;
import java.util.Scanner;

class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Enter the third number: ");
		int c = sc.nextInt();
		
		System.out.println(a>b?a>c?"a is largest":"c is largest":b>c?"b is largest":"c is largest");
		sc.close();
	}
}
