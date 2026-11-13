package number_series;
import java.util.Scanner;

class CheckStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int temp = n;
		int sum = 0;
		while(n!=0)
		{
			int digit = n%10;
			int prod = 1;

			for(int i=1; i<=digit; i++)
			{
				prod = prod*i;
			}
		 sum = sum + prod;
			n = n/10;
		}
		if(sum == temp) {
			System.out.println("It is a Strong Number");
		}
		else
			System.out.println("It is not a Strong Number");
	}
}
