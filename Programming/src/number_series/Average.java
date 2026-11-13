package number_series;
import java.util.Scanner;

class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		float sum = 0;
		float count = 0;
		while(n!=0)
		{
			int digit = n%10;
			count ++;
			sum = sum + digit;
			n = n/10;
		}
		System.out.println("Avegare of the number is: "+sum/count);
		sc.close();
		
	}
}
