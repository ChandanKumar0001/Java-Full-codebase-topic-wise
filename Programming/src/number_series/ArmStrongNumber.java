package number_series;
import java.util.Scanner;
class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		
		int temp1=n;
		int temp2=n;

		int sum=0; // to find the sum
		int count=0;// to find the count of digits

		// count of digits
		for(int i=0; n!=0; n=n/10)
		{
			count ++;
		}

		for(int i=0; temp1!=0;temp1=temp1/10)
		{
			int prod =1;
			int digit = temp1%10;


			// to multiply count times
			for(int j=1; j<=count;j++) 
			{
				prod = prod*digit;
			}
			sum = sum+prod;
		}
		if(sum == temp2) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("It is not an Armstrong Number");
		}
	}

}
