package patterns;

import java.util.Scanner;

class Pattern51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();

		for (int i = 1; i <=2*n-1; i++) // rows
		{
			int a = n;
			for (int j = 1; j <= 2*n-1; j++) // columns
			{
				if (i + j >= n + 1 && j - i <= n - 1 && i - j <= n - 1 && i + j <= 3 * n - 1) {
					if (j < n)
						System.out.print(a--);
					else
						System.out.print(a++);
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
