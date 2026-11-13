package patterns;
import java.util.Scanner;

public class Pattern53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();

		for (int i = 1; i <=2*n-1; i++) // rows
		{
			int a = 1;
			for (int j = 1; j <= 2*n-1; j++) // columns
			{
				if ((i<=j && i+j<=n*2)||(i+j>=n*2 && i>=j)) {
					System.out.print(a+++" ");
				} else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

