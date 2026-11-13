/* Define a method to check the given number is even or odd using modulus 
 * operator */

package operators;
import java.util.Scanner;
class modulus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		sc.close();
		
		checkNumber(n);  // Call the method to check if the number is even or odd
	}
	
	public static void checkNumber(int n) {
		if (n % 2 == 0) {  // Using the modulus operator for clarity
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
