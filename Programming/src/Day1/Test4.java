// WAJP to print the sum of digits in a given numbers.

package Day1;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		
		int sum = 0;
		while(n!=0) {
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		System.out.println("Sum is: "+sum);
		sc.close();
	}
}
