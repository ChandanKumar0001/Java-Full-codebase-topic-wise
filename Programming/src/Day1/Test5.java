// WAJP to print the product of  digits in a given number.

package Day1;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		
		int prod = 1;
		while(n!=0) {
			int digit = n%10;
			prod = prod * digit;
			n = n/10;
		}
		System.out.println("Product is: "+prod);
		sc.close();
	}
}
