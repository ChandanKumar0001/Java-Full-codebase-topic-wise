package patterns;
import java.util.Scanner;

class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n Value: ");
		int number = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=number; i++)
		{
			for(int j=1; j<=number; j++)
			{
				if(j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
