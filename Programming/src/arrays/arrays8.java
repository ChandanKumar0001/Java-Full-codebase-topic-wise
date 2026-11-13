package arrays;
import java.util.Scanner;
class arrays8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int[] ar = new int[size];
		
		System.out.println("Enter the array elements");
		
		//to take dynamic values form user
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		for(int i=0; i<ar.length; i++)
		{
			int result=isFactorial(ar[i]);
			System.out.println(ar[i]+"----->"+result);
		}
	}
	
	//to find factorial using method
	public static int isFactorial(int n) {
		int fact = 1;
		for (int j=1; j<=n; j++)
		{
			fact=fact*j;
		}
		return fact;
	}
}
