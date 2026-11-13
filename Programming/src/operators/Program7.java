package operators;
import java.util.Scanner;

class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		System.out.println(n%7==0||n%10==7?"It is a buzz number":"It is not a buzz number");
		sc.close();
	}
}
