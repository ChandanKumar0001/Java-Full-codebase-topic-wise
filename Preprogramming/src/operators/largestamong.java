/* Define a method to find largest among three number using simple if */

package operators;
import java.util.Scanner;
class largestamong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int largest = checklarger(a, b, c);  // Call the method and store result
		System.out.println("The largest number is: " + largest);
	}
	
	public static int checklarger(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;  
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
}

