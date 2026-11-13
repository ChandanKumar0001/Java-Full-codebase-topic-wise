// WAJP to print the number from n to 1.

package Day1;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n value: ");
		int n = sc.nextInt();
		sc.close();
		
		
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
	
	}
}
