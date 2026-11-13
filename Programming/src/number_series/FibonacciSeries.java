package number_series;
import java.util.Scanner;

class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int range,a=0,b=1,c;
		range =sc.nextInt();
		
		for(int i=1; i<=range; i++)
		{
			System.out.println(a);
			c = a+b;
			a = b;
			b = c;
		}
		
	}
}
