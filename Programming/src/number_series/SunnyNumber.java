package number_series;
import java.util.Scanner;

class SunnyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int add = n+1;
		boolean flag = false;
		for(int i=1; i<=add; i++)
		{
			if(i*i==add)
			{
				flag=true;
			}
		}
		if(flag==true)
			System.out.println("It is a Sunny number");
		else
			System.out.println("It is not a Sunny number");
		sc.close();
	}
}
