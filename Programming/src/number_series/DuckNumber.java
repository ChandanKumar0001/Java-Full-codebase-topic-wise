package number_series;
import java.util.Scanner;

class DuckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		sc.close();
		
		int count =0;
		
		while(n!=0)
		{
			int digit = n%10;
			if(digit == 0)
			{
				count++;
			}
			n = n/10;
			
		}
		
		if(count >= 1)
			System.out.println("It is a Duck Numbers");
		else
			System.out.println("It is not a Duck Numbers");
	}
}
