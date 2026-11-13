/* Define a method to check the given number is even or odd without using
 modulus operator */

package operators;
import java.util.Scanner;
class withoutmodulus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		sc.close();
		
		checkNumber(n);  // Call checkNumber to evaluate if the number is even or odd
	}
	
	public static void checkNumber(int n) {
		// Using bitwise AND to check if the last bit is 0 (even) or 1 (odd)
		if ((n & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}

