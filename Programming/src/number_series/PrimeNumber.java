package number_series;
import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();
		//calling another method
		boolean result=isPrime(n);
		if(result==true)
			System.out.println("It is a Prime number");
		else
			System.out.println("It is not a Prime number");
	}
	
	public static boolean isPrime(int n)
	{
		boolean flag = true;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}


