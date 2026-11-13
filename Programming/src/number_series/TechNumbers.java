package number_series;
import java.util.Scanner;

class TechNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int temp=n;
		
		int count =0; // to count the digits in a number
		
		for(int i=0; n!=0; n=n/10)
			count++;
		
		int d =1; // to go exactly half
		for(int i = 1; i<=count/2; i++)
			d=d*10;
		
		int last = temp%d;
		int first = temp/d;
		
		int sum = first + last;
		
		int square = sum * sum;
		
		if(square == temp)
			System.out.println("It is a tech number ");
		else
			System.out.println("It is not a tech number");
		
	}
	
}