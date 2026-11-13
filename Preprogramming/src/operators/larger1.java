/* Define a method to find 2nd largest among three number using else if ladder */

package operators;
import java.util.Scanner;
class larger1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		larger(a, b, c);  
	}
	public static void larger(int a, int b, int c) {
		if (a>b && a<c || a<b && a>c) {
			System.out.println("2nd Larger is: "+a);
		} 
		
		else if (b>a && b<c || b>c && b<a) {
			System.out.println("2nd Larger is: "+b);
		} 
		
		else {
			System.out.println("2nd Larger is: "+c);
		}
	}
}
