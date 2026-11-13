package operators;
import java.util.Scanner;

class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		
		
		System.out.println(a>9 && a<100? "It is a two digit number" : "It is not a two digit number");
		sc.close();
	}
}
