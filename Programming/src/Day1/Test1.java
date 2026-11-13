// WAJP to find the sum of first n numbers.

package Day1;
import java .util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n value: ");
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
