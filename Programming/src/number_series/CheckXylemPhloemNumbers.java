package number_series;
import java.util.Scanner;

class CheckXylemPhloemNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int outerSum = 0;
		int innerSum = 0;
		
		outerSum = n%10;
		n = n/10;
		
		while(n>9)
		{
			int digit = n%10;
			innerSum = innerSum + digit;
			n = n/10;
		}
		outerSum = outerSum + n;
		
		if(outerSum == innerSum)
			System.out.println("It is a Xylem number");
		else
			System.out.println("It is a Phloem number");
	}
}
