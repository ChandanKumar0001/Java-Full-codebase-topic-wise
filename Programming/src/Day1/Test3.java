// WAJP to access each digit present in the number.

package Day1;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		
		while(n!=0) 
		{
			int digit = n%10;
			System.out.println(digit);
			n = n/10;
		}
		sc.close();
	}
}
