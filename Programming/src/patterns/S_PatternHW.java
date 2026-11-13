package patterns;
import java.util.Scanner;

class S_PatternHW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=2*n-1;i++) 
		{
			for(int j=1; j<=n;j++) 
			{
				if(i==1 || i-j==1 || i==n || i-j==1 || i==2*n-1)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
