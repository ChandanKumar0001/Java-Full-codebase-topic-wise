/* Define a method to find smallest among three number
(a). Using logical operator
(b). without using logical operator
(c). with using only simple if.  */

package operators;
import java.util.Scanner;
class smallest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int smallest = findSmallestWithLogicalOperators(a, b, c);  // Call the method and store result
		System.out.println("The Smallest number is: " + smallest);
	}
	public static int findSmallestWithLogicalOperators(int a, int b, int c) {
	    if (a <= b && a <= c) {
	        return a;
	    } else if (b <= a && b <= c) {
	        return b;
	    } else {
	        return c;
	    }
	}

}
