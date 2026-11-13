package number_series;
import java.util.Scanner;

class Largest_digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int large = 0;
		while(n!=0)
		{
			int digit = n%10;
			if(digit>large)
				large = digit;
				n=n/10;
		}
		System.out.println("The largest digit in given number is: "+large);
		sc.close();
	}

}
