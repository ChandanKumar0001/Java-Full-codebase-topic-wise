/* Define a method to check the given number is divisible by 3 or divisible
 by 5 or devisible by both or devisible by not both*/

package operators;
import java.util.Scanner;

class devisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		sc.close();
		
		checkDivisibility(n);
	}
	
	public static void checkDivisibility(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("Divisible by both 3 and 5");
		} else if (n % 3 == 0) {
			System.out.println("Divisible by 3");
		} else if (n % 5 == 0) {
			System.out.println("Divisible by 5");
		} else {
			System.out.println("Not divisible by both");
		}
	}
}
