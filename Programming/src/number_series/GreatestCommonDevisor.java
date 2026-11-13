package number_series;
import java.util.Scanner;

class GreatestCommonDevisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = sc.nextInt();
		sc.close();
		
		int GCD = 0;
		
		for(int i=1;i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
				GCD=i;
		}
		System.out.println("The GCD of Given number is :"+GCD);
	}
}
