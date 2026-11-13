package arrays;
import java.util.Scanner;

class array10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();


		System.out.println("Enter the array elements:");
		int[] ar = new int[size];

		//to take dynamic values form user
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}

		int small = ar[0];
		for(int j=0; j<ar.length; j++)
		{
			if(ar[j] <small)
			{
				small = ar[j];
			}
		}
		System.out.println("Smallest element in given array is: "+small);
		sc.close();
	}
}
