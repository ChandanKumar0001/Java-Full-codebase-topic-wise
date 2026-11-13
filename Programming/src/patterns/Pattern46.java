package patterns;
import java.util.Scanner;

class Pattern46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			int a=n;
			for(int j=1; j<=2*n; j++)
			{
				if(i<=j && i+j<=n*2)
				{
					if(j<n)
						System.out.print(a--+" ");
					else
						System.out.print(a+++" ");
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
