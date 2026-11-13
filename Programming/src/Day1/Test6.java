// WAJP to find given number is Spy number or not.

package Day1;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		
		int prod = 1;
		int sum = 0;
		while(n!=0) {
			int digit = n%10;
			sum = sum + digit;
			prod = prod*digit;
			n = n/10;
		}
		if(sum == prod) {
		System.out.println("It is a Spy numbers");
		}
		else
			System.out.println("It is not a Spy number");
		sc.close();
	}
}
