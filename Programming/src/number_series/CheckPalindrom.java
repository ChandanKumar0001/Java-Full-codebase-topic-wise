package number_series;
import java.util.Scanner;

class CheckPalindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();
		int temp = n;
		int rev=0;
		while(n!=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println("It is a Pallindrom number");
		}
		else
			System.out.println("It is not a pallindrom number");
	}
}
