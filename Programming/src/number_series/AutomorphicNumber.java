package number_series;
import java.util.Scanner;

class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		sc.close();
		
		int square = n*n;
		boolean flag = true;
		
		while(n!=0)
		{
			if(n%10 == square%10)
			{
				n=n/10;
				square=square/10;
				//flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("Automorphic Number!");
		}
		else {
			System.out.println("Not Automorphic Number!");
		}
	}
}
