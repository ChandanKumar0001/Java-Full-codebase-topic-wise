/*(c). with using only simple if.  */

package operators;
import java.util.Scanner;
class smallest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int smallest = findSmallestWithSimpleIf(a, b, c);  // Call the method and store result
		System.out.println("The Smallest number is: " + smallest);
	}
	public static int findSmallestWithSimpleIf(int a, int b, int c) {
	    int smallest = a;
	    if (b < smallest) {
	        smallest = b;
	    }
	    if (c < smallest) {
	        smallest = c;
	    }
	    return smallest;
	}
}
