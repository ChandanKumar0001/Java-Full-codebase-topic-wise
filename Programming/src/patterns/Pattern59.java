package patterns;
import java.util.Scanner;

class Pattern59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();

		for (int i = 1; i <=2*n-1; i++) // rows
		{
			
			for (int j = 1; j <=2*n-1; j++) // columns
			{
				if (j==1 || j==2*n-1 || i==j || i+j==n*2) {
					System.out.print("*"+" ");
				} 
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
