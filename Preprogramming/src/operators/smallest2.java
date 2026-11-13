/* (b). without using logical operator */

package operators;
import java.util.Scanner;
class smallest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int smallest = findSmallestWithoutLogicalOperators(a, b, c);  // Call the method and store result
		System.out.println("The Smallest number is: " + smallest);
	}
	public static int findSmallestWithoutLogicalOperators(int a, int b, int c) {
	    return Math.min(a, Math.min(b, c));
	}
}