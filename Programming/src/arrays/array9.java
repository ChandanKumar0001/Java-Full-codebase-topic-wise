package arrays;
import java.util.Scanner;

class array9 {
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

		int large = ar[0];
		for(int j=0; j<ar.length; j++)
		{
			if(ar[j] >large)
			{
				large = ar[j];
			}
		}
		System.out.println("Largest element in given array is: "+large);
		sc.close();
	}
}


